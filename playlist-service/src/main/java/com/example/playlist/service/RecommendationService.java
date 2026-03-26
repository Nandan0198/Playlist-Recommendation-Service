package com.example.playlist.service;

import com.example.playlist.model.Song;
import com.example.playlist.strategy.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecommendationService {

    private final Map<String, RecommendationStrategy> strategies = new HashMap<>();

    public RecommendationService(List<RecommendationStrategy> list) {
        for (RecommendationStrategy s : list) {
            strategies.put(s.getName(), s);
        }
    }

    public List<Song> recommend(String type) {
        return strategies.getOrDefault(type, strategies.get("popular")).recommend();
    }
}