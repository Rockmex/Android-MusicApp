package com.example.android.rockmexmusic;

public class songs {
    private String songName;
    private String artistName;

    public songs(String song, String artist) {
        songName = song;
        artistName = artist;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }
}
