package com.survivalcoding;

abstract class Asset {

}

abstract class IntangibleAsset extends Asset {

}

class Patent extends IntangibleAsset {

}

abstract class TangibleAsset extends Asset implements Thing{
    String name;
    int price;
    String color;
    private double weight;

    @Override
    public double getWeight(){
        return weight;
    }

    @Override
    public void setWeight(double weight){
        this.weight = weight;
    }
}

class Book extends TangibleAsset {
    String isbn;
}

class Computer extends TangibleAsset {
    String makerName;
}