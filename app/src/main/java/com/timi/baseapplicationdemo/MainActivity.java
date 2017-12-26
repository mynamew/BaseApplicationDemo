package com.timi.baseapplicationdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends BaseActivity {


    TextView scanResult;

    @Override
    public int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initBundle(Bundle savedInstanceState) {

    }

    @Override
    public void initView() {
        scanResult= (TextView) findViewById(R.id.scan_result);
    }

    @Override
    public void initData() {

    }

    public void onClick(View view) {
        scan(1, new ScanQRCodeResultListener() {
            @Override
            public void scanSuccess(int requestCode, String result) {
                scanResult.setText(result + "\n requestCode------>" + requestCode);
            }
        });
    }


}
