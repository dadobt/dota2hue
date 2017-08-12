package com.example.dota2hue.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by dvilos on 8/8/2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class BridgeDTO {

  @JsonProperty("id")
  private String id;
  @JsonProperty("internalipaddress")
  private String internalipaddress;


  public BridgeDTO() {};

  public BridgeDTO(String id, String internalipaddress) {
    this.id = id;
    this.internalipaddress = internalipaddress;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getInternalipaddress() {
    return internalipaddress;
  }

  public void setInternalipaddress(String internalipaddress) {
    this.internalipaddress = internalipaddress;
  }

}
