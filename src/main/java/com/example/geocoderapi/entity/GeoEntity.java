package com.example.geocoderapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "geo_coder")
public class GeoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Double latitude;
    @Column
    private Double longitude;
    @Column
    private String type;
    @Column
    private String name;
    @Column
    private String number;
    @Column(name = "postal_code")
    private String postalCode;
    @Column
    private String street;
    @Column
    private Integer confidence;
    @Column
    private String region;
    @Column(name = "region_code")
    private String regionCode;
    @Column
    private String county;
    @Column
    private String locality;
    @Column(name = "administrative_area")
    private String administrativeArea;
    @Column
    private String neighbourhood;
    @Column
    private String country;
    @Column(name = "country_code")
    private String countryCode;
    @Column
    private String continent;
    @Column
    private String label;
    @Column(name = "map_url")
    private String mapUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public Integer getConfidence() {
        return confidence;
    }
    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getRegionCode() {
        return regionCode;
    }
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
    public String getCounty() {
        return county;
    }
    public void setCounty(String county) {
        this.county = county;
    }
    public String getLocality() {
        return locality;
    }
    public void setLocality(String locality) {
        this.locality = locality;
    }
    public String getAdministrativeArea() {
        return administrativeArea;
    }
    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }
    public String getNeighbourhood() {
        return neighbourhood;
    }
    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getMapUrl() {
        return mapUrl;
    }
    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }
}