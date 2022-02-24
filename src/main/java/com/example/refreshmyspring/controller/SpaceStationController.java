package com.example.refreshmyspring.controller;

import com.example.refreshmyspring.models.SpaceStation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-24
 * Time: 10:39
 * Project: refreshmyspring
 * Copyright: MIT
 */
@RestController
public class SpaceStationController {
    @GetMapping("/station/{stationId}")
    public SpaceStation getSpaceStation(@PathVariable Integer stationId){
        return new SpaceStation(stationId, "Rama", new Random().nextInt(), new Random().nextInt());
    }
}
