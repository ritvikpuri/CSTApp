package com.example.cstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class IndividualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual);
        Button indi = findViewById(R.id.btnBack);
        indi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(IndividualActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button word_ass = findViewById(R.id.btnWordAss);
        word_ass.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(IndividualActivity.this, WordAssociationIntro.class);
                startActivity(intent);
            }
        });
        Button num = findViewById(R.id.btnNumber);
        num.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(IndividualActivity.this, NumberGameIntro.class);
                startActivity(intent);
            }
        });
    }

}
