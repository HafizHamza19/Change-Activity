package com.example.hafizhamza.changeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        String age=intent.getStringExtra("Family");
        Toast toast=Toast.makeText(getApplicationContext(),age,Toast.LENGTH_SHORT);
        toast.show();

    }

    public void Back(View view) {
      // Intent intent=new Intent(getApplicationContext(),MainActivity.class);
       // startActivity(intent);
        finish();
    }
}
