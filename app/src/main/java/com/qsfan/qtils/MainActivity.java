package com.qsfan.qtils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.qsfan.qtils.rxjava.RxJavaRegisterActivity;
import com.qsfan.qtils.utiltest.RetTestActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_rxjava_request;
    private Button bt_ret_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        bt_rxjava_request = (Button) findViewById(R.id.bt_rxjava_request);
        bt_rxjava_request.setOnClickListener(this);
        bt_ret_test = (Button) findViewById(R.id.bt_ret_test);
        bt_ret_test.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_rxjava_request:
                startActivity(new Intent(this, RxJavaRegisterActivity.class));
                break;
            case R.id.bt_ret_test:
                startActivity(new Intent(this, RetTestActivity.class));
                break;
            default:
                break;
        }
    }
}
