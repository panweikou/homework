package com.epam.week1;

import java.util.ArrayList;
import java.util.List;

public class FindSecnodLengthTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        //Add the string to the list
        list.add("Epam");
        list.add("Testitagain");
        list.add("Howareyou");
        list.add("123456");

        //Add the same length string to the list
        List<String> list1 = new ArrayList<String>();
        list1.add("helpagain");
        list1.add("help");
        list1.add("what1");
        list1.add("12345");
        FindSecondLength findSecondLength = new FindSecondLength();
        System.out.println("Before the sorting:");
        findSecondLength.printList(list);
        System.out.println("");
        findSecondLength.listSearch(list);
        findSecondLength.printList(list);
        System.out.println("");
        String str = findSecondLength.returnString(list);
        System.out.println("For the first list the second length is: "+str);

        System.out.println("==============================");
        System.out.println("Before the sorting:");
        findSecondLength.printList(list1);
        System.out.println("");
        findSecondLength.listSearch(list1);
        System.out.println("After the sorting:");
        findSecondLength.printList(list1);
        System.out.println("");
        String str1 = findSecondLength.returnString(list1);
        System.out.println("For the second list the second length is: "+str1);
    }
}
