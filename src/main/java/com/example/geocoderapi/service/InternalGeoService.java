package com.example.geocoderapi.service;

import com.example.geocoderapi.dto.GeoDto;
import com.example.geocoderapi.entity.GeoEntity;
import com.example.geocoderapi.repository.GeoRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InternalGeoService {
    private ExternalGeoService externalGeoService;
    private GeoRepository geoRepository;
    private ModelMapper modelMapper;
    private final Logger logger = LoggerFactory.getLogger(InternalGeoService.class);


    public InternalGeoService(ExternalGeoService externalGeoService, GeoRepository geoRepository, ModelMapper modelMapper) {
        this.externalGeoService = externalGeoService;
        this.geoRepository = geoRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public GeoDto getGeoDataByLabel(String label) {
        logger.debug("Start do findGeoEntityByLabel call");
        Optional<GeoEntity> geoEntityByLabel = geoRepository.findGeoEntityByLabel(label);
        logger.info("Fetch data from db for label {}; result {}", label, geoEntityByLabel.isEmpty());
        if(geoEntityByLabel.isEmpty()) {
            GeoDto geoDataByLabel = externalGeoService.getGeoDataByLabel(label);
            GeoEntity geoEntity = modelMapper.map(geoDataByLabel, GeoEntity.class);
            GeoEntity saved = geoRepository.save(geoEntity);
            logger.info("Saved to db for label {}; result id {}", label, saved.getId());
            return modelMapper.map(saved, GeoDto.class);
        }
        logger.info("Get cashed data from db the geocoding with label {} and id {}", label, geoEntityByLabel.get().getId());
        return modelMapper.map(geoEntityByLabel.get(), GeoDto.class);
    }

    @Transactional
    public GeoDto getGeoDataByLatitudeAndLongitude(Double latitude, Double longitude) {
        logger.debug("Start do findGeoDataByLatitudeAndLongitude call");
        Optional<GeoEntity> geoEntityByLatitudeAndLongitude = geoRepository.findGeoEntityByLatitudeAndLongitude(latitude, longitude);
        logger.info("Fetch data from db for latitude {} and longitude {}; result {}", latitude, longitude, geoEntityByLatitudeAndLongitude.isEmpty());
        if(geoEntityByLatitudeAndLongitude.isEmpty()) {
            GeoDto geoDataByLatitudeAndLongitude = externalGeoService.getGeoDataByLatitudeAndLongitude(latitude, longitude);
            GeoEntity geoEntity = modelMapper.map(geoDataByLatitudeAndLongitude, GeoEntity.class);
            GeoEntity saved = geoRepository.save(geoEntity);
            logger.info("Saved to db for latitude {} and longitude {}; result id {}", latitude, longitude, saved.getId());
            return modelMapper.map(saved, GeoDto.class);
        }
        logger.info("Get cashed data from db the geocoding with latitude {},  longitude {} and id {}", latitude, longitude, geoEntityByLatitudeAndLongitude.get().getId());
        return modelMapper.map(geoEntityByLatitudeAndLongitude.get(), GeoDto.class);
    }
}
