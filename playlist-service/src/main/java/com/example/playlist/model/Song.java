package com.example.playlist.model;

public class Song {
    private String id;
    private String title;

    public Song(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
}