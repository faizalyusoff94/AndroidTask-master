package com.example.my.mytask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gallery extends AppCompatActivity {

    private Button btnFerrari;
    private Button btnLamborghini;
    private Button btnBMW;
    private Button btnMaserati;
    private Button btnAudi;
    private Button btnBugatti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        btnFerrari = (Button) findViewById(R.id.button2);
        btnLamborghini = (Button) findViewById(R.id.button3);
        btnMaserati = (Button) findViewById(R.id.button4);
        btnBMW = (Button) findViewById(R.id.button5);
        btnAudi = (Button) findViewById(R.id.button6);
        btnBugatti = (Button) findViewById(R.id.button7);

        btnFerrari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ferrari.class);
                startActivity(intent);
            }
        });

        btnLamborghini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), lamborghini.class);
                startActivity(intent);
            }
        });

        btnBMW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BMW.class);
                startActivity(intent);
            }
        });

        btnMaserati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), maserati.class);
                startActivity(intent);
            }
        });

        btnAudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), audi.class);
                startActivity(intent);
            }
        });

        btnBugatti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), buggati.class);
                startActivity(intent);
            }
        });
    }
}
