package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CallActivity extends AppCompatActivity {

    Button btnPlaceCall;
    EditText number;
    ClickListeners listeners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        btnPlaceCall = findViewById(R.id.btnCallNumber);
        number = findViewById(R.id.editTextNumber);

        listeners = new ClickListeners(this);
        btnPlaceCall.setOnClickListener(listeners);
    }
}