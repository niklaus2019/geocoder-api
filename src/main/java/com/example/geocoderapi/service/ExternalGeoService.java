package com.example.geocoderapi.service;

import com.example.geocoderapi.dto.GeoDto;
import com.example.geocoderapi.dto.GeoList;
import com.example.geocoderapi.exception.ExternalApiException;
import com.example.geocoderapi.repository.GeoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ExternalGeoService {
    private String urlForward = "https://api.positionstack.com/v1/forward?access_key=a3ec8e6c7a743a4c8c8f6e856b32d880&query=";
    private String urlReverse= "https://api.positionstack.com/v1/reverse?access_key=a3ec8e6c7a743a4c8c8f6e856b32d880&query=";
    private RestTemplate restTemplate;
    private GeoRepository geoRepository;
    private final Logger logger = LoggerFactory.getLogger(ExternalGeoService.class);

    public ExternalGeoService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public GeoDto getGeoDataByLabel(String label) {
        logger.debug("Start doing external call (by Label)");
        String externalUrlForward = urlForward + label;
        GeoList response = restTemplate.getForObject(externalUrlForward, GeoList.class);
        List<GeoDto> listGeoDto = response.getListDto();

        if(listGeoDto.isEmpty()) {
            logger.error("Data from external system not available for this address{} ", label);
            throw new ExternalApiException("Data from external system not available");
        }
        logger.info("External call for {} was completed", label);
        return listGeoDto.get(0);
    }

    public GeoDto getGeoDataByLatitudeAndLongitude(Double latitude, Double longitude) {
        logger.debug("Start doing external call (by LatitudeAndLongitude)");
        String externalUrlReverse = urlReverse + latitude + ", " + longitude;
        GeoList response = restTemplate.getForObject(externalUrlReverse, GeoList.class);
        List<GeoDto> listGeoDto = response.getListDto();
        if(listGeoDto.isEmpty()) {
            logger.error("Data from external system not available for latitude {} and longitude {}", latitude, longitude);
            throw new ExternalApiException("Data from external system not available");
        }
        logger.info("External call for latitude {} and longitude was completed", latitude, longitude);
        return listGeoDto.get(0);
    }
}
