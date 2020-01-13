package com.mohammadSharabati_ahmadSharabati.moviealert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button addManuallyMovie ,searchMovie,calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addManuallyMovie = (Button) findViewById(R.id.btnAddManuallyMovie);
        searchMovie = (Button) findViewById(R.id.btnSearchMovie);
        calendar = (Button) findViewById(R.id.btnCalendar);

        addManuallyMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signIn = new Intent(MainActivity.this,Add.class);
                startActivity(signIn);
            }
        });

        searchMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signIn = new Intent(MainActivity.this,Search.class);
                startActivity(signIn);
            }
        });
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signIn = new Intent(MainActivity.this,Calendar.class);
                startActivity(signIn);
            }
        });
    }
}
