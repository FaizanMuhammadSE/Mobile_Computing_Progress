package com.example.lec13_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.lec13_recyclerview.adapter.RecyclerViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<String> arrayList;
    int counter;
    TextView secView;
    TextView minView;
    TextView hourView;
    Button quizBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialization


        secView=findViewById(R.id.secView);
        minView=findViewById(R.id.minView);
        hourView=findViewById(R.id.hourView);

        quizBtn=findViewById(R.id.quizBtn);






        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        arrayList=new ArrayList<>();
        arrayList.add("Faizan");
        arrayList.add("Mehroz");
        arrayList.add("Gull");
        arrayList.add("Faraz");
        arrayList.add("Gull");
        arrayList.add("Faraz");

        recyclerViewAdapter=new RecyclerViewAdapter(MainActivity.this,arrayList);
        recyclerView.setAdapter(recyclerViewAdapter);
        arrayList.add("Ahsan");
    }

    public void fun(View view) {

                new CountDownTimer(4323000,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {  //it will be called at each countDownIntervals after starting
                        //timeView.setText(String.valueOf(millisUntilFinished/1000));
                        //counter++;
                        //timeView.setText(String.valueOf(counter));
                        long sec=millisUntilFinished/1000;
                        secView.setText(String.valueOf(sec%60));
                        minView.setText(String.valueOf(   ( sec / 60 ) % 60 ));
                        hourView.setText(String.valueOf((sec/60)/60));
                    }
                    @Override
                    public void onFinish() {
                        hourView.setText(String.valueOf(0));
                    }
                }.start();
    }
}