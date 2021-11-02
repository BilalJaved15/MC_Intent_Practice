package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MessageActivity extends AppCompatActivity {

    Button btnSendMessage;
    EditText message;
    ClickListeners listeners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        btnSendMessage = findViewById(R.id.btnSendMessage);
        message = findViewById(R.id.editTextMessage);

        listeners = new ClickListeners(this);
        btnSendMessage.setOnClickListener(listeners);
    }
}