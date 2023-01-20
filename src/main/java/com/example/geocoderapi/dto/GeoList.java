package com.example.geocoderapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class GeoList {
    @JsonProperty("data")
    private List<GeoDto> listDto;

    public GeoList() {
        listDto = new ArrayList<>();
    }

    public List<GeoDto> getListDto() {
        return listDto;
    }

    public void setListDto(List<GeoDto> listDto) {
        this.listDto = listDto;
    }


}
