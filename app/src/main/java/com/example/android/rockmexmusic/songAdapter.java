package com.example.android.rockmexmusic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class songAdapter extends ArrayAdapter<songs> {
    private Context context;

    public songAdapter(Activity context, ArrayList<songs> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        songs currentSong = getItem(position);

        ImageView play = (ImageView) listItemView.findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.INTENT_ACTION_MUSIC_PLAYER);
                v.getContext().startActivity(intent);
            }
        });

        TextView songName = (TextView) listItemView.findViewById(R.id.song_text_view);
        songName.setText(currentSong.getSongName());

        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistName.setText(currentSong.getArtistName());

        return listItemView;

    }

}
