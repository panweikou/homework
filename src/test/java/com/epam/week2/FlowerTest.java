package com.epam.week2;


public class FlowerTest {
    public static void main(String[] args) {
        IFlower iFlower = new Osmanthus();
        iFlower.smell();

        IFlower iFlower2 = new Perfume();
        iFlower2.smell();

        System.out.println("=========================================================");
        /**
         * Define the object of the flowers
         */
        Flower flower = new Chrysanthemum("Chrysanthemum",5);
        Flower flower1 = new Osmanthus("Osmanthus",4);
        Flower flower2 = new Rose("Rose",10);

        //Define a bouquet flowers that has 10 flowers.
        Flower[] flowers = new Flower[10];
        int Chrysanthemum = 0;
        int Osmanthus =0;
        int Rose=0;
        /**
         * It randoms generate number which flower is selected
         * 0 - Chrysanthemum
         * 1 - Osmanthus
         * 2 - Rose
         */
        for (int i =0;i<flowers.length;i++) {
            int count = (int)(Math.random()*3);
            switch (count) {
                case 0:
                    flowers[i] =flower;
                    Chrysanthemum+=1;
                    break;
                case 1:
                    flowers[i]=flower1;
                    Osmanthus+=1;
                    break;
                case 2:
                    flowers[i]=flower2;
                    Rose+=1;
                    break;
                default:
                    break;
            }
        }

        //Count a bouquet flowers cost how much money
        double sum=0;
        sum = flower.totalCount(Chrysanthemum)+ flower1.totalCount(Osmanthus)+ flower2.totalCount(Rose);

        System.out.println("A bouquet flowers price is: "+sum);
        System.out.println(flower.toString()+", It has "+Chrysanthemum);
        System.out.println(flower1.toString()+", It has "+Osmanthus);
        System.out.println(flower2.toString()+", It has "+Rose);

    }
}
