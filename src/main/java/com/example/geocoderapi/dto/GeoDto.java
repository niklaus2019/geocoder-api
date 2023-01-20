package com.example.geocoderapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GeoDto {

    private Double latitude;
    private Double longitude;
    private String type;
    private String name;
    private String number;
    @JsonProperty("postal_code")
    private String postalCode;
    private String street;
    private Integer confidence;
    private String region;
    private String regionCode;
    private String county;
    private String locality;
    @JsonProperty("administrative_area")
    private String administrativeArea;
    private String neighbourhood;
    private String country;
    @JsonProperty("country_code")
    private String countryCode;
    private String continent;
    private String label;
    @JsonProperty("map_url")
    private String mapUrl;

    public GeoDto() {

    }
    public GeoDto(Double latitude, Double longitude, String type, String name, String number, String postalCode, String street, Integer confidence, String region, String regionCode, String county, String locality, String administrativeArea, String neighbourhood, String country, String countryCode, String continent, String label, String mapUrl) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.type = type;
        this.name = name;
        this.number = number;
        this.postalCode = postalCode;
        this.street = street;
        this.confidence = confidence;
        this.region = region;
        this.regionCode = regionCode;
        this.county = county;
        this.locality = locality;
        this.administrativeArea = administrativeArea;
        this.neighbourhood = neighbourhood;
        this.country = country;
        this.countryCode = countryCode;
        this.continent = continent;
        this.label = label;
        this.mapUrl = mapUrl;
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