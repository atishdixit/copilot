package com.copilot.demo.factory;

public class Parser {
    private static Parser instance = null;

    private Parser() {
    }

    public static Parser getInstance() {
        if (instance == null) {
            instance = new Parser();
        }
        return instance;
    }
}
