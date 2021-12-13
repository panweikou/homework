package com.epam.week2;

public abstract class Flower implements IFlower{
    private String flowerName;
    private double price;

    public Flower() {}


    public Flower(String flowerName,double price) {
        this.setFlowerName(flowerName);
        this.setPrice(price);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Calculate the price of flowers
     * @param count
     * @return
     */
    public double totalCount(int count) {
        return this.getPrice()*count;
    }


    @Override
    public void eat() {
        System.out.println("I am the parent");
    }

    @Override
    public String toString() {
        String str = "Flower Name:"+this.getFlowerName()+ ","+"Every Flower Price: "+this.getPrice();
        return str;
    }

}
