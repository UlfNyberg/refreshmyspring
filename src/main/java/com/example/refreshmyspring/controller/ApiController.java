package com.example.refreshmyspring.controller;

import integration.ApiService;
import integration.ApiServiceProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-23
 * Time: 16:54
 * Project: refreshmyspring
 * Copyright: MIT
 */
@RestController
@EnableFeignClients(basePackageClasses = ApiServiceProxy.class)
public class ApiController implements ApiService {

    private ApiServiceProxy proxy;

    @Override
    @GetMapping("/booky")
    public List<Object> getBooks() {
        return proxy.getBooks();
    }
}
