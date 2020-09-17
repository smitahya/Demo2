package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //execute the base or superclass on create method
        setContentView(R.layout.activity_main); //responsible for applying the layout onto the activity
    }
}