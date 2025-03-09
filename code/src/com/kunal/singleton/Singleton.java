package com.kunal.singleton;

public class Singleton {
    
    private static Singleton instance;

    private Singleton() {  // ✅ Private constructor prevents external instantiation
    }

    public static Singleton getInstance() {  // ✅ Correct method to return the instance
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
