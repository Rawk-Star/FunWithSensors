package com.jeremyrawks.funwithsensors;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class SensorListActivity extends AppCompatActivity {

    TextView mSensorListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensor_list);

        mSensorListTextView = findViewById(R.id.gyroInfoTextView);

        // Get a list of all sensor on the device
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> deviceSensors = sensorManager.getSensorList(Sensor.TYPE_ALL);

        // Put all sensor info into a string and display on activity
        StringBuilder sensorList = new StringBuilder();
        for (Sensor sensor : deviceSensors) {
            String sensorInfo = "Sensor: " + sensor.getName() + " - " + sensor.getType() + "\n";
            sensorList.append(sensorInfo);
        }
        mSensorListTextView.setText(sensorList);

    }
}
