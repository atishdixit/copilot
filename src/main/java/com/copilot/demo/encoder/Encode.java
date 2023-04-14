package com.copilot.demo.encoder;

public class Encode {
    private static Encode instance = null;

    private Encode() {
    }

    public static Encode getInstance() {
        if (instance == null) {
            instance = new Encode();
        }
        return instance;
    }


}
