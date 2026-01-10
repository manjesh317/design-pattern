package com.learning.designPattern.creational.singleton;

import java.io.Serializable;


public class SingletonWithSerialization implements Serializable {

    private volatile static SingletonWithSerialization obj;

    private SingletonWithSerialization() {
        if (obj != null) throw new IllegalStateException("object already exist.");
    }

    public static SingletonWithSerialization getInstance() {
        if (obj == null) {
            synchronized (SingletonWithSerialization.class) {
                if (obj == null) {
                    obj = new SingletonWithSerialization();
                }
            }
        }
        return obj;
    }

    //add readResolve() method  --which will called during deserialization process -- this will return class instance
    protected Object readResolve() {
        return getInstance();
    }

}