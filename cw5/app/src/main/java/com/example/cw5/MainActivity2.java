package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView namet = findViewById(R.id.textView5);
        TextView namet2 = findViewById(R.id.textView6);


        Bundle bundle = getIntent().getExtras();
       String name2 = bundle.getString("name");
       namet.setText(name2);
       int age = bundle.getInt("age");
       namet2.setText(String.valueOf(age));
    }
}