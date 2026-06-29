package com.survivalcoding;

public class StrongBox<T> {
    private T item;
    private final KeyType keyType;
    private int count;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
        this.count = 0;
    }

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        count++;

        int limit;
        if (keyType == KeyType.PADLOCK) {
            limit = 1_024;
        } else if (keyType == KeyType.BUTTON) {
            limit = 10_000;
        } else if (keyType == KeyType.DIAL) {
            limit = 30_000;
        } else {
            limit = 1_000_000;
        }

        if (count >= limit) {
            return item;
        }
        return null;
    }
}