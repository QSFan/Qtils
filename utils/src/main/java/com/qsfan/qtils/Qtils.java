package com.qsfan.qtils;

import android.content.Context;

/**
 * =============版权所有===============
 * <p>
 * 类注释: Qtils 初始化
 * 作者: QSFan
 * 邮箱: qsfan_vip.163.com
 * 时间: 2018/1/24
 * 版本:
 * 备注：
 * ==============版权所有===============
 */
public final class Qtils {
    private static Context context;

    private Qtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static void init(Context context) {
        Qtils.context = context.getApplicationContext();
    }

    /**
     * 获取ApplicationContext
     *
     * @return ApplicationContext
     */
    public static Context getContext() {
        if (context != null) {
            return context;
        }
        throw new NullPointerException("u should init first");
    }
}
