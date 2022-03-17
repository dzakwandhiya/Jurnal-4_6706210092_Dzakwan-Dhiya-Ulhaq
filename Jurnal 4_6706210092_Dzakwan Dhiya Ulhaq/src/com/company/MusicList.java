package com.company;

public class MusicList {
    private String lagu;
    private String penyanyi;

    public MusicList(String lagu, String penyanyi) {
        this.lagu = lagu;
        this.penyanyi = penyanyi;

    }
    public String judul() {
        return lagu;
    }

    @Override
    public String toString() {
        return lagu + " - " + penyanyi;
    }
}
