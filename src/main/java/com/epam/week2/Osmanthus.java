package com.epam.week2;

public class Osmanthus extends Flower{

    public Osmanthus() {}

    public Osmanthus(String name, double price) {
        super(name,price);
    }

    @Override
    public void eat() {
        System.out.println("Osmanthus can eat!");
    }


}
