package com.qsfan.base.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * =============版权所有===============
 * <p>
 * 类注释:Activity基类
 * 作者: QSFan
 * 邮箱: qsfan_vip.163.com
 * 时间: 2017/11/22 11:04
 * 版本:
 * 备注：
 * ==============版权所有===============
 */
public class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityManager.getInstance().add(this);
    }

    //启动新的Activity
    public void goToActivity(Class Activity, Bundle bundle) {
        Intent intent = new Intent(this, Activity);
        if (bundle != null && bundle.size() != 0) {
            intent.putExtra("data", bundle);
        }
        startActivity(intent);
    }

    //销毁当前的Activity
    public void removeCurrentActivity() {
        ActivityManager.getInstance().removeCurrent();
    }

    //销毁所有的Activity
    public void removeAll() {
        ActivityManager.getInstance().removeAll();
    }

    /**
     * 设置title
     *
     * @param imageView
     * @param isshow
     * @param textView
     * @param title
     */
    protected void initTitle(ImageView imageView, boolean isshow, TextView textView, String title) {
        if (isshow) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
        } else {
            imageView.setVisibility(View.GONE);
        }
        textView.setText(title);
    }

    /**
     * 设置ToolBar
     *
     * @param toolbar         ToolBar
     * @param homeAsUpEnabled 是否显示左返回箭头
     * @param textView        设置标题的textView
     * @param title           标题
     */
    protected void initToolbar(Toolbar toolbar, boolean homeAsUpEnabled, TextView textView, String title) {
        toolbar.setTitle("");
        textView.setText(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(homeAsUpEnabled);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
