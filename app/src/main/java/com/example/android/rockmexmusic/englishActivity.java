package com.example.android.rockmexmusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class englishActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<songs> chineseSongs = new ArrayList<songs>();
        chineseSongs.add(new songs("7 Rings", "Ariana Grande"));
        chineseSongs.add(new songs("Thank U, Next", "Ariana Grande"));
        chineseSongs.add(new songs("Without Me", "Halsey"));
        chineseSongs.add(new songs("Happier", "Marshmello & Bastille"));
        chineseSongs.add(new songs("Sicko Mode", "Travis Scott"));
        chineseSongs.add(new songs("Wow.", "Post Malone"));
        chineseSongs.add(new songs("Middle Child", "J. Cole"));
        chineseSongs.add(new songs("Girls Like You", "Maroon 5 Featuring Cardi B"));
        chineseSongs.add(new songs("Needy", "Ariana Grande"));
        chineseSongs.add(new songs("Money", "Cardi B"));
        chineseSongs.add(new songs("Thotiana", "Blueface"));


        songAdapter adapter = new songAdapter(this, chineseSongs);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}