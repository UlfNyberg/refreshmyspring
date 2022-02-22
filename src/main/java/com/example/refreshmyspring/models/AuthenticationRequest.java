package com.example.refreshmyspring.models;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-22
 * Time: 15:53
 * Project: refreshmyspring
 * Copyright: MIT
 */

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * what the user is going to send in the post request, the needed class to define the structure
 */
@Slf4j
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationRequest {

    private String username;
    private String password;
}
