package com.jeremyrawks.funwithsensors;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSensorListClicked(View view) {
        Intent intent = new Intent(this, SensorListActivity.class);
        startActivity(intent);
    }

    public void onGyroClicked(View view) {
        Intent intent = new Intent(this, GyroActivity.class);
        startActivity(intent);
    }

    public void onAccelClicked(View view) {
        Intent intent = new Intent(this, AccelActivity.class);
        startActivity(intent);
    }

    public void onCameraClicked(View view) {
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }

    public void onPhotoExpressClicked(View view) {
        Intent intent = new Intent(this, PhotoExpressActivity.class);
        startActivity(intent);
    }
}
