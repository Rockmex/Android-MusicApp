package com.example.android.rockmexmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout chinese = (LinearLayout) findViewById(R.id.chinese);
        LinearLayout korean = (LinearLayout) findViewById(R.id.korean);
        LinearLayout english = (LinearLayout) findViewById(R.id.english);
        LinearLayout spanish = (LinearLayout) findViewById(R.id.spanish);

        chinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chineseIntent = new Intent(MainActivity.this, chineseActivity.class);
                startActivity(chineseIntent);
            }
        });
        korean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent koreanIntent = new Intent(MainActivity.this, koreanActivity.class);
                startActivity(koreanIntent);
            }
        });
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent englishIntent = new Intent(MainActivity.this, englishActivity.class);
                startActivity(englishIntent);
            }
        });
        spanish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spanishIntent = new Intent(MainActivity.this, spanishActivity.class);
                startActivity(spanishIntent);
            }
        });
    }
}
