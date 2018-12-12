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
        TextView imeiTextView=findViewById(R.id.imeiTextView);
        TelephonyManager tm=(TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        String imei="qwe";
        if (PermissionChecker.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") == PermissionChecker.PERMISSION_GRANTED)
            imei=tm.getDeviceId();
        imeiTextView.setText(imei);

        TextView versionTextView=findViewById(R.id.versionTextView);
        //String versionName = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        String versionName = BuildConfig.VERSION_NAME;
        versionTextView.setText(versionName);
    }
}
