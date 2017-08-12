package com.example.dota2hue.rest;

import com.example.dota2hue.DTO.InDTO.Wrapper;
import com.example.dota2hue.service.ActionService;
import com.example.dota2hue.service.HueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.example.dota2hue.CONSTANTS.ConstantsHue.NIGHT;

/**
 * Created by dvilos on 8/3/2017.
 */

@RestController
public class ParserRESTController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private HueService hueService;

    @Autowired
    private ActionService actionService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> hello(@RequestBody Wrapper s) {
        if(s != null) {
            actionService.daynight(s);
        }
        return ResponseEntity.ok("");
    }

    @RequestMapping(value = "/hi/{number}", method = RequestMethod.GET)
    public ResponseEntity<?> get(@PathVariable int number) {
        hueService.dosomething(NIGHT,number);
        return ResponseEntity.ok("");
    }
}
