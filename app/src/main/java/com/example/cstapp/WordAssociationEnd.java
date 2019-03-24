package com.example.cstapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WordAssociationEnd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_association_end);
        Button indi = findViewById(R.id.btnNext);
        indi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(WordAssociationEnd.this, IndividualActivity.class);
                startActivity(intent);
            }
        });
        Button back = findViewById(R.id.btnBack);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(WordAssociationEnd.this, WordAssociationIntro.class);
                startActivity(intent);
            }
        });
    }
}
