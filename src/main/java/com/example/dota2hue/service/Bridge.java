package com.example.dota2hue.service;


import com.example.dota2hue.DTO.BridgeDTO;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import static com.example.dota2hue.CONSTANTS.ConstantsHue.HTTPS_WWW_MEETHUE_COM_API_NUPNP;

/**
 * Created by dvilos on 8/8/2017.
 */
@Service
public class Bridge {



    private BridgeDTO bridgeDTO;

    private RestTemplate restTemplate = new RestTemplate();


    public void findBridgeOnNetwork(){

        ResponseEntity<BridgeDTO[]> forEntity = restTemplate.getForEntity(HTTPS_WWW_MEETHUE_COM_API_NUPNP, BridgeDTO[].class);
        bridgeDTO.setInternalipaddress(forEntity.getBody()[0].getInternalipaddress());
        bridgeDTO.setId(forEntity.getBody()[0].getId());

        String a ="B";
    }

    public BridgeDTO getBridgeDTO() {
        return bridgeDTO;
    }

    public void setBridgeDTO(BridgeDTO bridgeDTO) {
        this.bridgeDTO = bridgeDTO;
    }

}
