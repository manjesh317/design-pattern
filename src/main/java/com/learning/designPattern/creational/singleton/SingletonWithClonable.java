package com.learning.designPattern.creational.singleton;

import java.lang.Cloneable;

public class SingletonWithClonable implements Cloneable {

    private volatile static SingletonWithClonable instance;

    private SingletonWithClonable() {
        if (instance == null) {
            throw new IllegalStateException("instance already exist");
        }
    }

    public static SingletonWithClonable getInstance() {
        if (instance == null) {
            synchronized (SingletonWithClonable.class) {
                if (instance == null) {
                    instance = new SingletonWithClonable();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton instance can not be cloned!");
    }
}