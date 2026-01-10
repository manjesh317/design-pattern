package com.learning.designPattern.creational.builder;

public class ProductTest {
    public static void main(String[] args) {
        //usecase1: only mandatory fields
        Product product1 = new Product.ProductBuilder("mac", 1000).build();
        System.out.println(product1);

        //usecase2: mandatory + optional fields
        Product product2 = new Product.ProductBuilder("earbuds",500)
                .setCategory("apple")
                .setDisc("this is airpod 4 anc")
                .setFreeShipping(true)
                .setDiscount(10.0)
                .setStock(5)
                .build();
        System.out.println(product2);

        product2.setDiscount(5.0);

        System.out.println(product2);


    }
}
