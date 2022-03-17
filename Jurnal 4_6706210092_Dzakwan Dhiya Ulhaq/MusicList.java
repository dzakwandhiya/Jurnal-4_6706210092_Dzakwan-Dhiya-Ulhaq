package com.company;

public class MusicList {
    private String lagu;
    private String artis;

    public Barang(String lagu, String artis) {
        this.lagu = lagu;
        this.artis = artis;

    }
    public String judul() {

        return lagu;
    }

    @Override
    public String toString() {
        return lagu + " - oleh " + artis
                ;
    }
}
