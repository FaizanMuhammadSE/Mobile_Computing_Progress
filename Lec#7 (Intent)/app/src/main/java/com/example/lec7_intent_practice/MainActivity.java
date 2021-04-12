package com.example.lec7_intent_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Object Activity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newActivity(View view) {
        Intent intent=new Intent(this,Activity2.class); //making intent, first arg is current class, while 2nd arg is newActivity name
        startActivity(intent);                                        //start new activity
    }
}