package com.silenceneoxw.commonutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    
    private Button logTestButton;
    private Button toastTestButton;
    private TextView logTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        LogUtils.setLogLevel(BuildConfig.DEBUG ? LogUtils.LEVEL_DEBUG : LogUtils.LEVEL_ERROR);
        
        logTestButton = findViewById(R.id.log_test);
        toastTestButton = findViewById(R.id.toast_test);
        logTextView = findViewById(R.id.log_text);
        
        logTestButton.setOnClickListener(this);
        toastTestButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.log_test:
                String testText = getString(R.string.log_test_text);
                LogUtils.d(testText);
                LogUtils.d(TAG, testText);
                LogUtils.i(testText);
                LogUtils.i(TAG, testText);
                LogUtils.w(testText);
                LogUtils.w(TAG, testText);
                LogUtils.e(testText);
                LogUtils.e(TAG, testText);
                logTextView.setText(logTextView.getText() + "\n" + testText);
                break;
            case R.id.toast_test:
                ToastUtils.show(this, R.string.toast_test_text);
                ToastUtils.show(this, getString(R.string.toast_test_text));
                ToastUtils.show(this, R.string.toast_test_text, Toast.LENGTH_LONG);
                break;
        }
    }
}
