package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ALC","onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC","onStart called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC","onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC","onDestroy called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC","onPause called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC","onResume called");
    }

    public void updateValue(View view) {
        TextView  textView=findViewById(R.id.textView1);
        //int value=Integer.parseInt(String.valueOf(textView.getText()));
        //value++;
        counter++;
        textView.setText(String.valueOf(counter));
    }
}