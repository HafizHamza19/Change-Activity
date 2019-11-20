package com.example.hafizhamza.changeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.MylistView);
        final ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Hamza");
        arrayList.add("Hafiz");
        arrayList.add("HAssan");
        arrayList.add("Rafiq");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("Family",arrayList.get(i));
                startActivity(intent);
            }
        });
    }

    public void Next(View view) {
       //Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
       // intent.putExtra("Age",20);
        //startActivity(intent);

    }
}
