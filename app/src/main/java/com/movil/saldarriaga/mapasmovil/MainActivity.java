package com.movil.saldarriaga.mapasmovil;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.ConnectionResult;
import com.parse.Parse;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch (GooglePlayServicesUtil.isGooglePlayServicesAvailable(this))
        {
            case ConnectionResult.SUCCESS:
                Intent intento = new Intent(this, MapActivity.class);
                startActivity(intento);
                break;
            case ConnectionResult.SERVICE_MISSING:
                Toast.makeText(this, "Google Play services is missing on this device. ", Toast.LENGTH_LONG).show();
                finish();
                break;
            case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED:
                Toast.makeText(this, "The installed version of Google Play services is out of date. ", Toast.LENGTH_LONG).show();
                finish();
                break;
            case ConnectionResult.SERVICE_DISABLED:
                Toast.makeText(this, "The installed version of Google Play services has been disabled on this device. ", Toast.LENGTH_LONG).show();
                finish();
                break;
            case ConnectionResult.SERVICE_INVALID:
                Toast.makeText(this, "The version of the Google Play services installed on this device is not authentic. ", Toast.LENGTH_LONG).show();
                finish();
                break;
        }
    }
}
