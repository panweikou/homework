package com.epam.week3;
import com.epam.week2.Flower;
import java.util.Scanner;

public class FlowerMethod {

    /**
     * Get the price of the flowers
     * @param price  the flower price
     */
    public void TestFlowerPrice(double price) {
        System.out.println("Please guess the flower price: ");
        Scanner sc = new Scanner(System.in);
        Double guessPrice = sc.nextDouble();
        if(guessPrice!=price) {
            try {
                throw new CustomPriceGuessException();
            } catch (CustomPriceGuessException e) {
                System.out.println("You guess the wrong price, please guess it again");
            }
        }
    }

    /**
     * Search the flowers
     * @param flowers  define the flower price
     * @param osa      define the flower name
     */
    public void SearchFlower(Flower[] flowers, String osa) {
        boolean find = false;
        for(int i =0;i<flowers.length;i++) {
            if(flowers[i].getFlowerName().equals(osa)) {
                find = true;
            }
        }
        if(find == false) {
            try {
                throw new CustomFindFlower();
            }catch (CustomFindFlower e) {
                System.out.println("You cannot find this kind flower");
            }

        } else {
            System.out.println("Find it");
        }
    }

    /**
     * You will get a exception as your total money is less than any flower price
     */
    public void chooseWhich(Flower flower2,Flower flower3, Flower flower4,double totalPrice) {
        double price2 = flower2.getPrice();
        double price3 = flower3.getPrice();
        double price4 = flower4.getPrice();
        try {
            if (totalPrice <price2&&totalPrice<price3&&totalPrice<price4) {
                throw new CustomPrice();
            }
        }catch (CustomPrice e) {
            System.out.println("You cannot buy any flowers as you don't have enough money");
        }

    }


}
