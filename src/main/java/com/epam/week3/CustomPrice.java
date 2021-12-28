package com.epam.week3;

public class CustomPrice extends Exception{
    public CustomPrice() {
        super("You cannot buy any flowers as you don't have enough money");
    }

    public CustomPrice(String message) {
        super(message);
    }
}
