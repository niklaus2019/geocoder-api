package com.example.geocoderapi.repository;

import com.example.geocoderapi.entity.GeoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GeoRepository extends JpaRepository<GeoEntity, Long>{
        Optional<GeoEntity> findGeoEntityByLabel(String label);
        Optional<GeoEntity> findGeoEntityByLatitudeAndLongitude(Double latitude, Double longitude);
}
