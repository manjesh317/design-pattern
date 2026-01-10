package com.learning.designPattern.creational.singleton;

public class Singleton {
    //1. private static instance of the class
    private volatile static Singleton obj;

    //2. Private constructor to prevent/avoid intantiation/object
    private Singleton() {
        if (obj != null) {
            throw new IllegalArgumentException("Object already exist");
        }
    }

    //3. public static getInstance method to provide acces to instance/object
    public static Singleton getInstance() {
        if (obj == null) {
            synchronized (Singleton.class) {
                if (obj == null) {
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }

}