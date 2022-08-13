package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        EditText e1 = findViewById(R.id.ed1);
        EditText e2 = findViewById(R.id.ed2);




        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent b1 = new Intent(MainActivity.this,MainActivity2.class);
                String customername = e1.getText().toString();
                int customerage = Integer.parseInt(e2.getText().toString());
                b1.putExtra("name",customername);
                b1.putExtra("age",customerage);

                startActivity(b1);
            }
        })
    ;}

}