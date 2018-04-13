package com.qsfan.qtils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.qsfan.qtils.rxjava.RxJavaRegisterActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtRxjavaRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtRxjavaRequest = (Button) findViewById(R.id.bt_rxjava_request);

        mBtRxjavaRequest.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_rxjava_request:
                startActivity(new Intent(this, RxJavaRegisterActivity.class));
                break;
            default:
                break;
        }
    }
}
