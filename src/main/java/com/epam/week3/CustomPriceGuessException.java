package com.epam.week3;

public class CustomPriceGuessException extends Exception{
    public CustomPriceGuessException() {
        super("You guess the wrong price, please guess it again");
    }
}
