package com.example.refreshmyspring.models;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-22
 * Time: 15:56
 * Project: refreshmyspring
 * Copyright: MIT
 */
@Slf4j
@Getter
@Builder
@AllArgsConstructor
public class AuthentificationResponse {

    private final String jwt;

}
