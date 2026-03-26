package com.example.playlist.cache;

import com.example.playlist.model.Playlist;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.function.Supplier;

@Service
public class CacheAsideService {

    private Map<String, Playlist> cache = new HashMap<>();

    public Playlist get(String id, Supplier<Playlist> dbCall) {
        if (cache.containsKey(id)) {
            System.out.println("CACHE HIT");
            return cache.get(id);
        }

        System.out.println("CACHE MISS");
        Playlist p = dbCall.get();
        if (p != null) cache.put(id, p);
        return p;
    }
}