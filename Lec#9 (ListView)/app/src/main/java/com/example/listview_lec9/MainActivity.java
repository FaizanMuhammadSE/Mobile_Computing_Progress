package com.example.listview_lec9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> countryList;
    ArrayAdapter<String> listAdapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("LV","onCreate");
        setContentView(R.layout.activity_main);
        countryList=new ArrayList<String>();
        countryList.add("Pakistan");
        countryList.add("India");
        countryList.add("China");
        countryList.add("America");
        countryList.add("England");
        listAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,countryList);
        //make object of listView and get it using id
        listView=findViewById(R.id.myListView);
        listView.setAdapter(listAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("Item Clicked",countryList.get(position));
                Intent intent = new Intent(MainActivity.this,CalledActivity.class);
                intent.putExtra("countryName",countryList.get(position));
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LV","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LV","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LV","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LV","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LV","onResume");
    }

    public void addText(View view) {
        EditText editText=findViewById(R.id.editText1);
        countryList.add(editText.getText().toString());    //text is added in list
        //listView.setAdapter(listAdapter);                  //reseting it due to new item added
        //Or
        listAdapter.notifyDataSetChanged();      //notifying adapter that I've added one more item
        editText.setText("");    //empty string to make input field clear
        Collections.sort(countryList);  //will be sorted
    }
}