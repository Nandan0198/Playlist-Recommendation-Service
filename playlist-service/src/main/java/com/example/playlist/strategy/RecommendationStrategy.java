package com.example.playlist.strategy;

import com.example.playlist.model.Song;

import java.util.*;

public interface RecommendationStrategy {
    List<Song> recommend();
    String getName();
}