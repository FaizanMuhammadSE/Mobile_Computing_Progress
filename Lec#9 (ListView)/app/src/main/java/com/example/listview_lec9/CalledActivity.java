package com.example.listview_lec9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CalledActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("LV2","onCreate");
        setContentView(R.layout.activity_called);
        Intent intent=getIntent();
        TextView textView=findViewById(R.id.textView2);
        textView.setText(intent.getStringExtra("countryName"));
        Log.d("newActivity",intent.getStringExtra("countryName"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LV2","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LV2","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LV2","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LV2","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LV2","onResume");
    }
}