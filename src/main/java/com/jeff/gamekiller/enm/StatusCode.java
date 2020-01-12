package com.jeff.gamekiller.enm;

public enum StatusCode {
    OK(0),
    NO(1),
    OTHER(99);

    private int value;

    StatusCode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}
