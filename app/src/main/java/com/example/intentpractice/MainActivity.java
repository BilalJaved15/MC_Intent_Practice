package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAlarm, btnPicture, btnCall, btnMessage, btnRepo;
    ClickListeners listeners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAlarm = findViewById(R.id.btnAlarm);
        btnPicture = findViewById(R.id.btnPicture);
        btnCall = findViewById(R.id.btnCall);
        btnMessage = findViewById(R.id.btnMessage);
        btnRepo = findViewById(R.id.btnRepo);

        listeners = new ClickListeners(this);
        btnAlarm.setOnClickListener(listeners);
        btnPicture.setOnClickListener(listeners);
        btnCall.setOnClickListener(listeners);
        btnMessage.setOnClickListener(listeners);
        btnRepo.setOnClickListener(listeners);
    }


}