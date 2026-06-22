package com.survivalcoding;

abstract class Asset {

}

abstract class IntangibleAsset extends Asset {

}

class Patent extends IntangibleAsset {

}

abstract class TangibleAsset extends Asset implements Thing {
    private String name;
    private int price;
    private String color;
    private double weight;

    public TangibleAsset(String name, int price, String color, double weight) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Book extends TangibleAsset {
    private String isbn;

    public Book(String name, int price, String color, double weight, String isbn) {
        super(name, price, color, weight);
        this.isbn = isbn;
    }
}

class Computer extends TangibleAsset {
    private String makerName;

    public Computer(String name, int price, String color, double weight, String makerName) {
        super(name, price, color, weight);
        this.makerName = makerName;
    }
}