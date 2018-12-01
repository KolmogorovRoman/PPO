package com.kolmogorov.ppo;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.PermissionChecker;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

import java.util.jar.Manifest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tw=findViewById(R.id.text);
        TelephonyManager tm=(TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        java.lang.String imei="qwe";
        if (PermissionChecker.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") == PermissionChecker.PERMISSION_GRANTED)
            imei=tm.getDeviceId();


        tw.setText(imei);
    }
}
