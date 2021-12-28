package com.epam.week3;

public class CustomFindFlower extends Exception{
   public CustomFindFlower() {
       super("Cannot find this kind flower");
   }

   public CustomFindFlower(String message) {
       super(message);
   }

   public CustomFindFlower(String type, String message) {
       super(type+":"+message);
   }
}
