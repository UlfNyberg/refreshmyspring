package com.example.refreshmyspring.models;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-21
 * Time: 14:04
 * Project: refreshmyspring
 * Copyright: MIT
 */
@Slf4j
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    private String message;
    private Boolean status;
}
