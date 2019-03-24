package com.example.cstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WordAssociationIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_association_intro);
        Button indi = findViewById(R.id.btnNext);
        indi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(WordAssociationIntro.this, WordAssociationQ1.class);
                startActivity(intent);
            }
        });
    }
}
