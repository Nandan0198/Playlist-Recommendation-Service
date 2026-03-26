package com.example.playlist.service;

import com.example.playlist.model.Playlist;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PlaylistService {

    private Map<String, Playlist> db = new HashMap<>();

    public Playlist create(Playlist p) {
        p.setId(UUID.randomUUID().toString());
        db.put(p.getId(), p);
        return p;
    }

    public Playlist get(String id) {
        return db.get(id);
    }
}