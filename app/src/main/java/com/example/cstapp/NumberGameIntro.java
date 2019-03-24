package com.example.cstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberGameIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_game_intro);
        Button word_ass = findViewById(R.id.btnWordAss);
        word_ass.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(NumberGameIntro.this, NumberGameQ1.class);
                startActivity(intent);
            }
        });
    }
}
