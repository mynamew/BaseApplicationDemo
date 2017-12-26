package com.timi.baseapplicationdemo;

import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends BaseActivity {


    TextView scanResult;
    EditText editText;
    EditText editText2;

    @Override
    public int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initBundle(Bundle savedInstanceState) {

    }

    @Override
    public void initView() {
        scanResult = (TextView) findViewById(R.id.scan_result);
        editText = (EditText) findViewById(R.id.et_input);
        editText2 = (EditText) findViewById(R.id.et_input2);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b) {
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.requestFocus();
                    editText.findFocus();
                    editText.setSelectAllOnFocus(true);
                    Selection.selectAll(editText.getText());
                }
            }
        });
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b) {
                    editText2.setFocusable(true);
                    editText2.setFocusableInTouchMode(true);
                    editText2.requestFocus();
                    editText2.findFocus();
                    editText2.setSelectAllOnFocus(true);
                    Selection.selectAll(editText2.getText());
                }
            }
        });
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
