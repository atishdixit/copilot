package com.copilot.demo.factory;

public class DataBase {
    private static DataBase instance = null;

    private DataBase() {
    }

    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }
}
