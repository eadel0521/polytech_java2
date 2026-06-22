package com.survivalcoding;

abstract class Asset {

}

abstract class IntangibleAsset extends Asset {

}

class Patent extends IntangibleAsset {

}

abstract class TangibleAsset extends Asset {
    String name;
    int price;
    String color;
}

class Book extends TangibleAsset {
    String isbn;
}

class Computer extends TangibleAsset {
    String makerName;
}