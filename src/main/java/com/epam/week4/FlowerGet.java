package com.epam.week4;

import com.epam.week2.Chrysanthemum;
import com.epam.week2.Flower;
import com.epam.week2.Osmanthus;
import com.epam.week2.Rose;

import java.util.List;

public class FlowerGet {

    public String getName(List<String> list) {
        String str ="";
        String name = list.get(0);
        double price = Double.parseDouble(list.get(1));
        if(name.equals("Rose")) {
            Flower flower = new Rose(name,price);
            str = flower.toString();
        }else if(name.equals("Osmanthus")) {
            Flower flower1 = new Osmanthus(name,price);
            str = flower1.toString();
        } else if(name.equals("Chrsanthemum")) {
            Flower flower2 = new Chrysanthemum(name,price);
            str = flower2.toString();
        }
        return str;
    }
}
