package com.epam.week4;


import com.epam.week3.CustomFindFlower;
import com.epam.week3.CustomPrice;
import com.epam.week3.CustomPriceGuessException;

import java.util.List;
import java.util.Scanner;

public class ReadFromDBTest {
    public static void main(String[] args) {

        /**
         * 0 - Quit
         * 1 - Query the flower name and price
         * 2 - Query the exception
         */

        while (true) {
            System.out.println("Please enter the number you want to query: ");
            Scanner sc = new Scanner(System.in);
            Integer in = sc.nextInt();
            if(in==0) {
                break;
            }
            switch (in) {
                case 1:
                    //Flower name is: Osmanthus,Rose,Chrsanthemum
                    List<String> list;
                    Command queryCommand = new QueryFlowerCommand();
                    list = queryCommand.execute();
                    FlowerGet flowerGet = new FlowerGet();
                    System.out.println(flowerGet.getName(list));
                    break;
                case 2:
                    //Exception type is: findFlower, customPrice, guessPrice
                    List<String> list1;
                    Command queryCommands = new QueryExceptionCommand();
                    list1 = queryCommands.execute();
                    String name = list1.get(0);
                    String message = list1.get(1);
                    if(name.equals("findFlower")) {
                        try{
                            throw new CustomFindFlower(message);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else  if(name.equals("customPrice")) {
                        try{
                            throw new CustomPrice(message);

                        }catch (Exception e) {
                            e.printStackTrace();
                        }

                    } else if(name.equals("guessPrice")) {
                        try {
                            throw new CustomPriceGuessException(message);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
        }
    }
}
