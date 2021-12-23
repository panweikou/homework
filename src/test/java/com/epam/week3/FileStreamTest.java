package com.epam.week3;

import com.epam.week2.Flower;
import com.epam.week2.Rose;

public class FileStreamTest {
    public static void main(String[] args) {
        FileStream fileStream = new FileStream();
        //Write the flower name and price to the text
        fileStream.writeFile("flowers.txt");
        String str = fileStream.readFile("flowers.txt");

        System.out.println("***************************************");
        //Read the data and set it to the flower.
        String[] fl = new String[4];
        fl= str.split(",");
        for(int i=0;i<fl.length/2;i++) {
            Flower flower = new Rose(fl[2*i],Double.parseDouble(fl[2*i+1]));
            System.out.println("The flower name is "+flower.getFlowerName()+", and this flower price is "+flower.getPrice());
        }
    }
}
