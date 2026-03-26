package com.example.playlist.strategy;

import com.example.playlist.model.Song;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class CollaborativeFilteringStrategy implements RecommendationStrategy {

    public List<Song> recommend() {
        return List.of(new Song("3", "Collaborative Song"));
    }

    public String getName() { return "collab"; }
}