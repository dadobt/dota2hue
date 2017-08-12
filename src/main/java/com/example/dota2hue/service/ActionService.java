package com.example.dota2hue.service;

import com.example.dota2hue.DTO.InDTO.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.dota2hue.CONSTANTS.ConstantsHue.DAY;
import static com.example.dota2hue.CONSTANTS.ConstantsHue.NIGHT;

/**
 * Created by dvilos on 8/6/2017.
 */

@Service
public class ActionService {

    @Autowired
    public HueService hueService;

    //true == day
    Boolean state = true;


    public void daynight(Wrapper wrapper){

        if(!wrapper.getMap().getDaytime() && (state==true)){
            //night
            hueService.dosomething(NIGHT ,1);
            hueService.dosomething(NIGHT ,2);
            hueService.dosomething(NIGHT ,3);

            state = false;
        }
        if(wrapper.getMap().getDaytime() && (state==false)){
            //day
            hueService.dosomething(DAY,1);
            hueService.dosomething(DAY,2);
            hueService.dosomething(DAY,3);
            state = true;
        }
    }
}
