package com.example.playlist.controller;

import com.example.playlist.model.*;
import com.example.playlist.service.*;
import com.example.playlist.cache.CacheAsideService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/playlists")
public class PlaylistController {

    private final PlaylistService service;
    private final CacheAsideService cache;

    public PlaylistController(PlaylistService s, CacheAsideService c) {
        this.service = s;
        this.cache = c;
    }

    @PostMapping
    public ApiResponse<Playlist> create(@RequestBody Playlist p) {
        return ApiResponse.success(service.create(p));
    }

    @GetMapping("/{id}")
    public ApiResponse<Playlist> get(@PathVariable String id) {
        Playlist p = cache.get(id, () -> service.get(id));
        if (p == null) return ApiResponse.error("Not found");
        return ApiResponse.success(p);
    }
}