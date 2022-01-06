package com.epam.week2;

import java.util.logging.Logger;

public class Chrysanthemum extends Flower{
    Logger logger= java.util.logging.Logger.getLogger(Chrysanthemum.class.getName());

    public Chrysanthemum() {}

    public Chrysanthemum(String name,double price) {
        super(name,price);
    }

    @Override
    public void smell() {
        logger.info("Chrysanthemum smell very good!");
    }

}
