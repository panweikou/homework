package com.epam.week2;

public class Rose extends Flower {
    public Rose() {}

    public Rose(String name, double price) {
        super(name,price);
    }

    @Override
    public void eat() {
        System.out.println("Rose can eat!");
    }
}
