package com.example.refreshmyspring.controller;

import com.example.refreshmyspring.models.SpaceStation;
import integration.SpaceStationClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-24
 * Time: 10:43
 * Project: refreshmyspring
 * Copyright: MIT
 */

/**
 * example showing how sleek it is using the feign client
 */
@RestController
@RequiredArgsConstructor
public class StatusController {

    private final SpaceStationClient spaceStationClient;

    @GetMapping(path="/status")
    public SpaceStation status(){
        return spaceStationClient.findSpaceStation(new Random().nextInt());
    }

}
