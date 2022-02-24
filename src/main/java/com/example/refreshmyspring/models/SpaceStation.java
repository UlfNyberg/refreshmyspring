package com.example.refreshmyspring.models;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-24
 * Time: 10:41
 * Project: refreshmyspring
 * Copyright: MIT
 */
@Slf4j
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SpaceStation {
    private Integer stationId;
    private String name;
    private Integer crew;
    private Integer diameter;

}
