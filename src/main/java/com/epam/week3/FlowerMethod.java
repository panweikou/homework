package com.epam.week3;
import com.epam.week2.Flower;
import java.util.Scanner;

public class FlowerMethod {

    /**
     * Get the price of the flowers
     * @param price  the flower price
     */
    public void TestFlowerPrice(double price) throws CustomPriceGuessException {
        System.out.println("Please guess the flower price: ");
        Scanner sc = new Scanner(System.in);
        Double guessPrice = sc.nextDouble();
        if(guessPrice!=price) {
            throw new CustomPriceGuessException();
        }
    }

    /**
     * Search the flowers
     * @param flowers  define the flower price
     * @param osa      define the flower name
     */
    public void SearchFlower(Flower[] flowers, String osa) throws CustomFindFlower {
        boolean find = false;
        for(int i =0;i<flowers.length;i++) {
            if(flowers[i].getFlowerName().equals(osa)) {
                find = true;
            }
        }
        if(find == false) {
            throw new CustomFindFlower();
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
