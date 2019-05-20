package com.dangerye.games.aias.model;

import lombok.Data;

@Data
public class Antique {

    private String name;
    private boolean isAuthenticity;
    private boolean isAuthenticityToXY;

    private boolean canAppraise;
}
