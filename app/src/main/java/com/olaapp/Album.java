package com.olaapp;

/**
 * Created by dell on 12/30/2016.
 */
public class Album {

    String song, url, artists, cover_image;


    public Album(String song, String url,

                 String artists, String cover_image) {
        this.song = song;
        this.url = url;
        this.artists = artists;
        this.cover_image = cover_image;

    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getArtists() {
        return artists;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public String getCover_image() {
        return cover_image;
    }

    public void setCover_image(String cover_image) {
        this.cover_image = cover_image;
    }
}
