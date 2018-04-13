package com.qsfan.qtils.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.qsfan.qtils.R;

public class RxJavaRegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_mobile;
    private EditText et_verification;
    private Button bt_get_verification;
    private Button bt_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_java_register);
        initView();
    }

    private void initView() {
        et_mobile = (EditText) findViewById(R.id.et_mobile);
        et_verification = (EditText) findViewById(R.id.et_verification);
        bt_get_verification = (Button) findViewById(R.id.bt_get_verification);
        bt_register = (Button) findViewById(R.id.bt_register);

        bt_get_verification.setOnClickListener(this);
        bt_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_get_verification:

                break;
            case R.id.bt_register:

                break;
            default:
                break;
        }
    }

    private void submit() {
        // validate
        String mobile = et_mobile.getText().toString().trim();
        if (TextUtils.isEmpty(mobile)) {
            Toast.makeText(this, "请输入手机号", Toast.LENGTH_SHORT).show();
            return;
        }

        String verification = et_verification.getText().toString().trim();
        if (TextUtils.isEmpty(verification)) {
            Toast.makeText(this, "请输入验证码", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}
