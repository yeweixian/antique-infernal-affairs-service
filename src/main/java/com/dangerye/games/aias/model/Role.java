package com.dangerye.games.aias.model;

import com.dangerye.games.aias.constant.Formation;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Role {

    private String name;
    private Formation formation;
}
