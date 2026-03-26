package com.example.playlist.controller;

import com.example.playlist.model.*;
import com.example.playlist.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/recommend")
public class RecommendationController {

    private final RecommendationService service;

    public RecommendationController(RecommendationService s) {
        this.service = s;
    }

    @GetMapping
    public ApiResponse<List<Song>> get(@RequestParam String type) {
        return ApiResponse.success(service.recommend(type));
    }
}