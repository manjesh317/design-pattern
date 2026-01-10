package com.learning.designPattern.creational.singleton;

public class TestSingletonWithClonable {
    public static void main(String[] args) {
        SingletonWithClonable instance1 = SingletonWithClonable.getInstance();

        try {
            SingletonWithClonable instance2 = (SingletonWithClonable) instance1.clone();
            System.out.println("Instance1: " + instance1);
            System.out.println("Instance2: " + instance2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}