package com.epam.week2;

public interface IFlower {
    default void eat() {
        System.out.println("I am the default interface");
    };
}
