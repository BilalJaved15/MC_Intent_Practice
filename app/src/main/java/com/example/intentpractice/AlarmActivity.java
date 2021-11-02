package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TimePicker;

public class AlarmActivity extends AppCompatActivity {

    Button addAlarm;
    TimePicker timePicker;
    ClickListeners listeners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        addAlarm = findViewById(R.id.btnAddAlarm);
        timePicker = findViewById(R.id.timePicker);

        listeners = new ClickListeners(this);
        addAlarm.setOnClickListener(listeners);
    }
}