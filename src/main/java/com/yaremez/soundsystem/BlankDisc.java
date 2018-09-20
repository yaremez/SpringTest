package com.yaremez.soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.printf("Playing %s by %s.\n", title, artist);
        for (String track : tracks) {
            System.out.printf("-Track: %s\n", track);
        }
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.printf("Playing %s by %s.\n", title, artist);
        System.out.printf("-Track: %s\n", tracks.get(trackNumber));
    }
}