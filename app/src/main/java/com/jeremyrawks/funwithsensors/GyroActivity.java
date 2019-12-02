package com.jeremyrawks.funwithsensors;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GyroActivity extends AppCompatActivity {

    TextView mGyroInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyro);

        mGyroInfoTextView = findViewById(R.id.gyroInfoTextView);

        // Get the gyroscope sensor
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor gyroSensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        StringBuilder gyroInfo = new StringBuilder();
        if (gyroSensor == null) {
            // No gyroscope on this device
            gyroInfo.append("No gyroscope sensor exists");
        }
        else {
            // Put all gyroscope info into a string
            gyroInfo.append("Name: ").append(gyroSensor.getName()).append("\n");
            gyroInfo.append("Type: ").append(gyroSensor.getType()).append("\n");
            gyroInfo.append("Vendor: ").append(gyroSensor.getVendor()).append("\n");
            gyroInfo.append("Version: ").append(gyroSensor.getVersion()).append("\n");
            gyroInfo.append("Min Delay: ").append(gyroSensor.getMinDelay()).append("\n");

        }
        mGyroInfoTextView.setText(gyroInfo);
    }
}
