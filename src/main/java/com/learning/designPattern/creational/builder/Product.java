package com.learning.designPattern.creational.builder;

public class Product {
    //required fields
    private String name;
    private double price;

    //optional fields
    private String disc;
    private String category;
    private double discount;
    private boolean freeShipping;
    private int stock;

    public Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.disc = builder.disc;
        this.category = builder.category;
        this.discount = builder.discount;
        this.freeShipping = builder.freeShipping;
        this.stock = builder.stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", disc='" + disc + '\'' +
                ", category='" + category + '\'' +
                ", discount=" + discount +
                ", freeShipping=" + freeShipping +
                ", stock=" + stock +
                '}';
    }

    public static class ProductBuilder{
        private String name;
        private double price;

        //optional fields
        private String disc;
        private String category;
        private double discount;
        private boolean freeShipping;
        private int stock;

        public ProductBuilder(String name, double price){
            this.name=name;
            this.price=price;
        }

        public ProductBuilder setDisc(String disc) {
            this.disc = disc;
            return this;
        }

        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public ProductBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public ProductBuilder setFreeShipping(boolean freeShipping) {
            this.freeShipping = freeShipping;
            return this;
        }

        public ProductBuilder setStock(int stock) {
            this.stock = stock;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }
}
