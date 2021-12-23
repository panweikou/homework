package com.epam.week3;

import com.epam.week2.Chrysanthemum;
import com.epam.week2.Flower;
import com.epam.week2.Osmanthus;
import com.epam.week2.Rose;


public class CustomExceptionTest {
    public static void main(String[] args) {
        Flower flower = new Osmanthus("Osmanthus",25.00);
        //Guess the flower price.
        double price = flower.getPrice();
        FlowerMethod flowerFind = new FlowerMethod();
        flowerFind.TestFlowerPrice(price);
        System.out.println();


        //Find the flower
        System.out.println("***********************************************");
        Flower[] flowers = new Flower[10];
        Flower flower1 = new Chrysanthemum("Chrysanthemum",5);
        for(int i=0;i<flowers.length;i++) {
            flowers[i] = flower1;
        }
        flowerFind.SearchFlower(flowers,"osa");
        System.out.println();


        //Which flowers can be buy, if your amount is less than any price
        System.out.println("***********************************************");
        Flower flower2 = new Chrysanthemum("Chry",30);
        Flower flower3 = new Osmanthus("Osman",40);
        Flower flower4 = new Rose("Rose",60);
        flowerFind.chooseWhich(flower2,flower3,flower4,20);
    }
}
