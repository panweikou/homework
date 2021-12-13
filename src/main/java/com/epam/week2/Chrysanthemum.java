package com.epam.week2;

public class Chrysanthemum extends Flower{

    public Chrysanthemum() {}

    public Chrysanthemum(String name,double price) {
        super(name,price);
    }

    @Override
    public void eat() {
        System.out.println("Chrysanthemum can eat!");
    }

}
