package com.taha.weather.dto;

public record Request(
        String type,
        String query,
        String language,
        String unit
) {}
