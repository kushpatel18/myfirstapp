package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.view.PinView;

public class LoginOtpActivity extends AppCompatActivity {

    String phoneNumber;
    TextView number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_otp);

        phoneNumber = getIntent().getExtras().getString("phone");
        number = findViewById(R.id.phone);
        number.setText(phoneNumber);
        Toast.makeText(this, phoneNumber, Toast.LENGTH_SHORT).show();

    }
}