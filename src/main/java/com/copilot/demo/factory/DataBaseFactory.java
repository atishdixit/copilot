package com.copilot.demo.factory;

import com.copilot.demo.Singleton;

public class DataBaseFactory {
    public static DataBase getDataBase() {
        return DataBase.getInstance();
    }

    public static Parser getParser() {
        return Parser.getInstance();
    }

    public static Singleton getSingleton() {
        return Singleton.getInstance();
    }
}
