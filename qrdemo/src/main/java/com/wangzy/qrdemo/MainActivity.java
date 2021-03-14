package com.wangzy.qrdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.xm.permissions.OnRequestPermissionsCallback;
import com.xm.permissions.XmPermissions;

public class MainActivity extends Activity implements OnRequestPermissionsCallback {


    private XmPermissions xmPermissions;

    private int buttonId = R.id.buttonDefault;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("微信二维码扫描引擎移植");

        xmPermissions = XmPermissions.Companion.newInstance(this);
        xmPermissions.setOnRequestPermissionsCallback(this);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonId = v.getId();
                xmPermissions.requestAllPermissions();
//                switch (v.getId()) {
//                    case R.id.buttonDefault:
//
//                        break;
//                    case R.id.buttonPortrait:
//                        xmPermissions.requestAllPermissions();
//                        break;
//                }
            }
        };
        findViewById(R.id.buttonDefault).setOnClickListener(clickListener);
        findViewById(R.id.buttonPortrait).setOnClickListener(clickListener);
        findViewById(R.id.buttonDefaultFullScreen).setOnClickListener(clickListener);
    }


    private void gotoActivity(Activity context, Class claz) {
        Intent intent = new Intent(context, claz);
        startActivity(intent);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        xmPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        xmPermissions.onActivityResult(requestCode);
    }

    //所有权限允许的情况去扫描页面
    @Override
    public void onGranted() {

        switch (buttonId) {
            case R.id.buttonDefault:
                gotoActivity(MainActivity.this, Qr1LandActivity.class);
                break;
            case R.id.buttonDefaultFullScreen:
                gotoActivity(MainActivity.this, Qr1LandFullScreenActivity.class);
                break;
            case R.id.buttonPortrait:
                gotoActivity(MainActivity.this, Qr1PortraitActivity.class);
                break;
        }

    }

    @Override
    public void onDenied(String[] strings) {
        Toast.makeText(this, "请允许所有权限", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPermanentlyDenied(String[] strings) {
        Toast.makeText(this, "请允许所有权限", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSettingBackDenied(String[] strings) {
        Toast.makeText(this, "请允许所有权限", Toast.LENGTH_SHORT).show();
    }
}
