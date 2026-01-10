package com.learning.designPattern.creational.singleton;

import java.io.*;

public class TestSingletonWithSerialization {
    public static void main(String[] args) {
        try {
            SingletonWithSerialization obj1 = SingletonWithSerialization.getInstance();

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("SingletonWithSerialization.json"));
            out.writeObject(obj1);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("SingletonWithSerialization.json"));
            SingletonWithSerialization obj2 = (SingletonWithSerialization) in.readObject();
            in.close();

            ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("SingletonWithSerialization.json"));
            SingletonWithSerialization obj3 = (SingletonWithSerialization) in1.readObject();
            in1.close();

            System.out.println("instance1: " + obj1);
            System.out.println("instance2: " + obj2);
            System.out.println("instance3: " + obj3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}