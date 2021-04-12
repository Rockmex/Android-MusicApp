package com.example.android.rockmexmusic;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class spanishActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<songs> chineseSongs = new ArrayList<songs>();
        chineseSongs.add(new songs("MIA", "Bad Bunny Featuring Drake"));
        chineseSongs.add(new songs("Despacito", "Luis Fonsi & Daddy Yankee"));
        chineseSongs.add(new songs("Secreto", "Anuel AA & Karol G"));
        chineseSongs.add(new songs("Solo de Mi", "Bad Bunny"));
        chineseSongs.add(new songs("X", "Nicky Jam x J Balvin"));
        chineseSongs.add(new songs("El Farsante", "Ozuna & Romeo Santos"));
        chineseSongs.add(new songs("Impossible", "Luis Fonsi + Ozuna"));
        chineseSongs.add(new songs("Oye Mujer", "Raymix"));
        chineseSongs.add(new songs("Amanece", "Anuel AA X Haze"));
        chineseSongs.add(new songs("Baño", "Enrique Iglesias"));
        chineseSongs.add(new songs("Dura", "Daddy Yankee"));

        songAdapter adapter = new songAdapter(this, chineseSongs);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}