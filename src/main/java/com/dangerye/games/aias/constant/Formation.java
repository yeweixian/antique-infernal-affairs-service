package com.dangerye.games.aias.constant;

public enum Formation {

    XUYUAN(1),
    LAOCHAOFENG(2);

    private int no;

    Formation(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }
}
