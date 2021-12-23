package com.epam.week3;

import com.epam.week2.Chrysanthemum;
import com.epam.week2.Flower;
import com.epam.week2.Osmanthus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BuiltInExceptions {
    public static void main(String[] args) {

        //Unable to cast properly during type conversion
        try {
            Flower flower1 = new Osmanthus();
            Flower flower2 = new Chrysanthemum();
            Osmanthus osmanthus1 = (Osmanthus)flower2;
            Osmanthus osmanthus2 = (Osmanthus) flower1;
        }catch (Exception e) {
            System.out.println("Chrysanthemum cannot be cast to Osmanthus");
        }
        System.out.println();

        System.out.println("*****************************************");
        //Array index out of bounds exception
        try {
            Flower[] flowers = new Flower[10];
            Flower flower = new Chrysanthemum("Chrysanthemum",5);
            for(int i=0;i<=flowers.length;i++) {
                flowers[i] = flower;
            }
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds exception");
        }
        System.out.println();

        System.out.println("*****************************************");
        //Reference method calls with empty objects
        try {
            String name=null;
            Chrysanthemum chrysanthemum = new Chrysanthemum(name,12.4);
            if(name.equals("Chrry")) {
                System.out.println("Print the flower");
            }
        }catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("*****************************************");
        //The divisor of an arithmetic operation is 0
        //Input mismatch exception
        try {
            System.out.println("Please enter the total price:");
            Scanner sc = new Scanner(System.in);
            int totalPrice = sc.nextInt();
            System.out.println("Please enter the Chrysanthemum price:");
            int price = sc.nextInt();
            System.out.println("It count can buy how many Chrysanthemum:"+totalPrice/price);

        } catch (InputMismatchException e ) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();
    }
}
