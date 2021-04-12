package com.example.android.rockmexmusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class koreanActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<songs> chineseSongs = new ArrayList<songs>();
        chineseSongs.add(new songs("After You've Gone", "M.C. The Max"));
        chineseSongs.add(new songs("Gotta Go", "Chung Ha"));
        chineseSongs.add(new songs("Fire Up", "Woody"));
        chineseSongs.add(new songs("180 Degree", "Ben"));
        chineseSongs.add(new songs("Home", "SEVENTEEN"));
        chineseSongs.add(new songs("Shin Yong Jae", "HAEUN"));
        chineseSongs.add(new songs("Yes or Yes", "TWICE"));
        chineseSongs.add(new songs("%%", "Apink"));
        chineseSongs.add(new songs("Love Shot", "EXO"));
        chineseSongs.add(new songs("Bbibbi", "IU"));
        chineseSongs.add(new songs("IDOL", "BTS"));
        chineseSongs.add(new songs("DDU-DU DDU-DU", "BLACKPINK"));
        chineseSongs.add(new songs("Spring Breeze", "BTS"));

        songAdapter adapter = new songAdapter(this, chineseSongs);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}