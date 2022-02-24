package com.example.refreshmyspring.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-24
 * Time: 12:44
 * Project: refreshmyspring
 * Copyright: MIT
 */
@Configuration
@Slf4j
public class SpaceStationClientInterceptor implements RequestInterceptor{

    @Override
    public void apply(RequestTemplate template){
        template.header("myheaderkey", "myvar1");
        log.warn("** LOOK! USING A CUSTOM INTERCEPTOR (CUSTOM HEADER) **");

    }
}
