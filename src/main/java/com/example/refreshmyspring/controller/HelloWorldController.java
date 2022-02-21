package com.example.refreshmyspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-21
 * Time: 12:49
 * Project: refreshmyspring
 * Copyright: MIT
 */

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping("/swe")
    public String sweIndex(){
        return "Hej världen!";
    }
}
