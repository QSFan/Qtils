package com.qsfan.qtils.utiltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.qsfan.choseaddress.picker.AddressInitTask;
import com.qsfan.qtils.R;

public class RetTestActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ret_test);
        initView();
    }

    private void initView() {
        bt_add = (Button) findViewById(R.id.bt_add);

        bt_add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_add:
                AddressInitTask addressInitTask = new AddressInitTask(this,"city.json");
                addressInitTask.execute("河南", "郑州", "二七区");
                addressInitTask.setOnAddressListener(new AddressInitTask.OnAddressListener() {
                    @Override
                    public void onAdressListener(String sheng, String shi, String qu ,String shiID,String xianID) {
//                        tv_sheng.setText(sheng);
//                        tv_shi.setText(shi);
//                        tv_xian.setText(qu);
                    }
                });
                break;
        }
    }
}
