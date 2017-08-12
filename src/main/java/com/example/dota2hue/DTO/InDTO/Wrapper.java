package com.example.dota2hue.DTO.InDTO;


import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Wrapper {

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @JsonProperty("map")
    private Map map;

    public Wrapper(){}

    public Wrapper(Map map) {
        this.map = map;
    }
}