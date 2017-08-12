package com.example.dota2hue.DTO.InDTO;

import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;

/**
 * Created by dvilos on 8/4/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Map {

    @JsonProperty("name")
    private String name;
    @JsonProperty("matchid")
    private Integer matchid;
    @JsonProperty("game_time")
    private Integer gameTime;
    @JsonProperty("clock_time")
    private Integer clockTime;
    @JsonProperty("daytime")
    private Boolean daytime;
    @JsonProperty("nightstalker_night")
    private Boolean nightstalkerNight;
    @JsonProperty("game_state")
    private String gameState;
    @JsonProperty("win_team")
    private String winTeam;
    @JsonProperty("customgamename")
    private String customgamename;
    @JsonProperty("radiant_ward_purchase_cooldown")
    private Integer radiantWardPurchaseCooldown;
    @JsonProperty("dire_ward_purchase_cooldown")
    private Integer direWardPurchaseCooldown;
    @JsonProperty("roshan_state")
    private String roshanState;
    @JsonProperty("roshan_state_end_seconds")
    private Integer roshanStateEndSeconds;
    @JsonIgnore
    @Valid
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("matchid")
    public Integer getMatchid() {
        return matchid;
    }

    @JsonProperty("matchid")
    public void setMatchid(Integer matchid) {
        this.matchid = matchid;
    }

    @JsonProperty("game_time")
    public Integer getGameTime() {
        return gameTime;
    }

    @JsonProperty("game_time")
    public void setGameTime(Integer gameTime) {
        this.gameTime = gameTime;
    }

    @JsonProperty("clock_time")
    public Integer getClockTime() {
        return clockTime;
    }

    @JsonProperty("clock_time")
    public void setClockTime(Integer clockTime) {
        this.clockTime = clockTime;
    }

    @JsonProperty("daytime")
    public Boolean getDaytime() {
        return daytime;
    }

    @JsonProperty("daytime")
    public void setDaytime(Boolean daytime) {
        this.daytime = daytime;
    }

    @JsonProperty("nightstalker_night")
    public Boolean getNightstalkerNight() {
        return nightstalkerNight;
    }

    @JsonProperty("nightstalker_night")
    public void setNightstalkerNight(Boolean nightstalkerNight) {
        this.nightstalkerNight = nightstalkerNight;
    }

    @JsonProperty("game_state")
    public String getGameState() {
        return gameState;
    }

    @JsonProperty("game_state")
    public void setGameState(String gameState) {
        this.gameState = gameState;
    }

    @JsonProperty("win_team")
    public String getWinTeam() {
        return winTeam;
    }

    @JsonProperty("win_team")
    public void setWinTeam(String winTeam) {
        this.winTeam = winTeam;
    }

    @JsonProperty("customgamename")
    public String getCustomgamename() {
        return customgamename;
    }

    @JsonProperty("customgamename")
    public void setCustomgamename(String customgamename) {
        this.customgamename = customgamename;
    }

    @JsonProperty("radiant_ward_purchase_cooldown")
    public Integer getRadiantWardPurchaseCooldown() {
        return radiantWardPurchaseCooldown;
    }

    @JsonProperty("radiant_ward_purchase_cooldown")
    public void setRadiantWardPurchaseCooldown(Integer radiantWardPurchaseCooldown) {
        this.radiantWardPurchaseCooldown = radiantWardPurchaseCooldown;
    }

    @JsonProperty("dire_ward_purchase_cooldown")
    public Integer getDireWardPurchaseCooldown() {
        return direWardPurchaseCooldown;
    }

    @JsonProperty("dire_ward_purchase_cooldown")
    public void setDireWardPurchaseCooldown(Integer direWardPurchaseCooldown) {
        this.direWardPurchaseCooldown = direWardPurchaseCooldown;
    }

    @JsonProperty("roshan_state")
    public String getRoshanState() {
        return roshanState;
    }

    @JsonProperty("roshan_state")
    public void setRoshanState(String roshanState) {
        this.roshanState = roshanState;
    }

    @JsonProperty("roshan_state_end_seconds")
    public Integer getRoshanStateEndSeconds() {
        return roshanStateEndSeconds;
    }

    @JsonProperty("roshan_state_end_seconds")
    public void setRoshanStateEndSeconds(Integer roshanStateEndSeconds) {
        this.roshanStateEndSeconds = roshanStateEndSeconds;
    }

    @JsonAnyGetter
    public java.util.Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
