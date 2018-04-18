package com.qsfan.base.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.Stack;

/**
 * =============版权所有===============
 * <p>
 * 类注释:Activity管理类
 * 作者: QSFan
 * 邮箱: qsfan_vip.163.com
 * 时间: 2018/4/18
 * 版本:
 * 备注：
 * ==============版权所有===============
 */
public class ActivityManager {
    //单例模式：饿汉式
    private ActivityManager() {

    }

    private static ActivityManager activityManager = new ActivityManager();

    public static ActivityManager getInstance() {
        return activityManager;
    }

    //提供栈的对象
    private Stack<Activity> activityStack = new Stack<>();

    //activity的添加
    public void add(Activity activity) {
        if (activity != null) {
            activityStack.add(activity);
        }
    }

    //插曲：[12,3,44,6,332,65,-56,1]
    //删除指定的activity
    public void remove(Activity activity) {
        if (activity != null) {
//            for(int i = 0; i < activityStack.size(); i++) {
//                Activity currentActivity = activityStack.get(i);
//                if(currentActivity.getClass().equals(activity.getClass())){
//                    currentActivity.finish();//销毁当前的activity
//                    activityStack.remove(i);//从栈空间移除
//                }
//            }

            for (int i = activityStack.size() - 1; i >= 0; i--) {
                Activity currentActivity = activityStack.get(i);
                if (currentActivity.getClass().equals(activity.getClass())) {
                    currentActivity.finish();//销毁当前的activity
                    activityStack.remove(i);//从栈空间移除
                }
            }
        }
    }

    //删除当前的activity
    public void removeCurrent() {
        //方式一：
//        Activity activity = activityStack.get(activityStack.size() - 1);
//        activity.finish();
//        activityStack.remove(activityStack.size() - 1);

        //方式二：
        Activity activity = activityStack.lastElement();
        activity.finish();
        activityStack.remove(activity);
    }

    //删除所有的activity
    public void removeAll() {
        for (int i = activityStack.size() - 1; i >= 0; i--) {
            Activity activity = activityStack.get(i);
            activity.finish();
            activityStack.remove(activity);
        }
    }

    //返回栈大小
    public int size() {
        return activityStack.size();
    }

    /**
     * 通过设置全屏，设置状态栏透明
     *
     * @param activity
     */
    private void setActivityFullScreen(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                //5.x开始需要把颜色设置透明，否则导航栏会呈现系统默认的浅灰色
                Window window = activity.getWindow();
                View decorView = window.getDecorView();
                //两个 flag 要结合使用，表示让应用的主体内容占用系统状态栏的空间
                int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
                decorView.setSystemUiVisibility(option);
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(Color.TRANSPARENT);
                //导航栏颜色也可以正常设置
//                window.setNavigationBarColor(Color.TRANSPARENT);
            } else {
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                int flagTranslucentStatus = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
                int flagTranslucentNavigation = WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION;
                attributes.flags |= flagTranslucentStatus;
//                attributes.flags |= flagTranslucentNavigation;
                window.setAttributes(attributes);
            }
        }
    }

}
