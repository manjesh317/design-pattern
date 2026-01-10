package com.learning.designPattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class TestSingleton {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1);

        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2);

        Singleton obj3 = null;

        try {
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            obj3 = constructor.newInstance();
            System.out.println(obj3);

        } catch (NoSuchMethodException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
        }


    }
}