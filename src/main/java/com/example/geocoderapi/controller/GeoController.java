package com.example.geocoderapi.controller;

import com.example.geocoderapi.dto.GeoDto;
import com.example.geocoderapi.service.InternalGeoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class GeoController {
    private InternalGeoService internalGeoService;

    public GeoController(InternalGeoService internalGeoService) {
        this.internalGeoService = internalGeoService;
    }

    @GetMapping("/geolocation/{label}")
    public GeoDto geoDtoLabel(@PathVariable String label) {
        return internalGeoService.getGeoDataByLabel(label);
    }

    @GetMapping("/geolocation/{latitude}/{longitude}")
    public GeoDto geoDtoLatitudeAndLongitude(@PathVariable(name = "latitude") Double latitude, @PathVariable(name = "longitude") Double longitude) {
        return internalGeoService.getGeoDataByLatitudeAndLongitude(latitude, longitude);
    }


}

