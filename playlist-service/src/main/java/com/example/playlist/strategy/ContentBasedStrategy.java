package com.example.playlist.strategy;

import com.example.playlist.model.Song;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class ContentBasedStrategy implements RecommendationStrategy {

    public List<Song> recommend() {
        return List.of(new Song("2", "Content Song"));
    }

    public String getName() { return "content"; }
}