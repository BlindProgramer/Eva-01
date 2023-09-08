package com.example.eva01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button spanishbt;
    Button germanbt;
    Button itabt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spanishbt=(Button)findViewById(R.id.spanishbt);


        spanishbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent spanishbt = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(spanishbt);


            };
        });

        germanbt=(Button)findViewById(R.id.germanbt);

        germanbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent germanbt=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(germanbt);

            }
        });

        itabt=(Button)findViewById(R.id.itabt);

        itabt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent itabt=new Intent(MainActivity.this, MainActivity4.class);
                startActivity(itabt);
            }
        });


    }
}