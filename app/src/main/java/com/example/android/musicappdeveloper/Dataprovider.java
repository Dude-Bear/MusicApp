package com.example.android.musicappdeveloper;

/**
 * Created by Bjoer on 08.03.2018.
 */

public class Dataprovider {

    public Dataprovider (int img_res, String artist, String title){
        this.setImg_res(img_res);
        this.setArtist(artist);
        this.setTitle(title);
    }

    private int img_res;
    private String artist, title;

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
