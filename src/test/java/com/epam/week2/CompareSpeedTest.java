package com.epam.week2;

import java.io.IOException;
import java.util.*;

public class CompareSpeedTest {
    public static void main(String[] args) throws IOException {
        CompareSpeed compareSpeed = new CompareSpeed();
        List<String> lists;
        LinkedList<String> linkedList;
        Set<String> hashset;
        Set<String> treeSet;
        Map<String,String> map;
        Map<String,String> treeMap;

        long startTime = System.nanoTime();
        lists = compareSpeed.addElement("elements.txt");
        long endTime = System.nanoTime();
        long time = endTime-startTime;
        System.out.println("Add the elements for the ArrayList time is:" +time+" ms");
        System.out.println();

        System.out.println("*********************************************");
        long startTime1 = System.nanoTime();
        compareSpeed.getListElement(lists,"received");
        long endTime1 = System.nanoTime();
        long time1 = endTime1 - startTime1;
        System.out.println("Search the elements for ArrayList time is:" +time1+" ms");
        System.out.println();

        System.out.println("*********************************************");
        compareSpeed.getListElement(lists,"received");
        long startTime2 = System.nanoTime();
        compareSpeed.delListElement(lists,"received");
        long endTime2 = System.nanoTime();
        long time2 = endTime2 - startTime2;
        System.out.println("Delete the elements for ArrayList time is:" +time2+" ms");
        compareSpeed.getListElement(lists,"received");
        System.out.println();


        System.out.println("*********************************************");
        long startTime3 = System.nanoTime();
        linkedList = compareSpeed.addLinkList("elements.txt");
        long endTime3 = System.nanoTime();
        long time3 = endTime3 - startTime3;
        System.out.println("Add the elements for the LinkList time is:" +time3+" ms");
        System.out.println();

        System.out.println("*********************************************");
        long startTime4 = System.nanoTime();
        compareSpeed.getListElement(linkedList,"received ");
        long endTime4 = System.nanoTime();
        long time4 = endTime4 - startTime4;
        System.out.println("Search the elements for LinkList time is:" +time4+" ms");
        System.out.println();

        System.out.println("*********************************************");
        compareSpeed.getListElement(linkedList,"received ");
        long startTime5 = System.nanoTime();
        compareSpeed.delListElement(linkedList,"received");
        long endTime5 = System.nanoTime();
        long time5 = endTime5 - startTime5;
        System.out.println("Delete the elements for linkList time is:" +time5+" ms");
        compareSpeed.getListElement(linkedList,"received ");
        System.out.println();

        System.out.println("*********************************************");
        long startTime6 = System.nanoTime();
        hashset = compareSpeed.addHashElement("elements.txt");
        long endTime6 = System.nanoTime();
        long time6 = endTime6-startTime6;
        System.out.println("Add the elements for the Hashset time is:" +time6+" ms");
        System.out.println();

        System.out.println("*********************************************");
        long startTime7 = System.nanoTime();
        compareSpeed.searchHash(hashset,"received");
        long endTime7 = System.nanoTime();
        long time7 = endTime7 - startTime7;
        System.out.println("Search the elements for Hashset time is:" +time7+" ms");
        System.out.println();

        System.out.println("*********************************************");
        compareSpeed.searchHash(hashset,"received");
        long startTime8 = System.nanoTime();
        compareSpeed.deleteHash(hashset,"received");
        long endTime8 = System.nanoTime();
        long time8 = endTime8 - startTime8;
        System.out.println("Delete the elements for Hashset time is:" +time8+" ms");
        compareSpeed.searchHash(hashset,"received");
        System.out.println();

        System.out.println("*********************************************");
        long startTime9 = System.nanoTime();
        treeSet = compareSpeed.addHashElement("elements.txt");
        long endTime9 = System.nanoTime();
        long time9 = endTime9-startTime9;
        System.out.println("Add the elements for the TreeSet time is:" +time9+" ms");
        System.out.println();

        System.out.println("*********************************************");
        long startTime10 = System.nanoTime();
        compareSpeed.searchHash(treeSet,"received");
        long endTime10 = System.nanoTime();
        long time10 = endTime10 - startTime10;
        System.out.println("Search the elements for TreeSet time is:" +time10+" ms");
        System.out.println();

        System.out.println("*********************************************");
        compareSpeed.searchHash(treeSet,"received");
        long startTime11 = System.nanoTime();
        compareSpeed.deleteHash(treeSet,"received");
        long endTime11 = System.nanoTime();
        long time11 = endTime11 - startTime11;
        System.out.println("Delete the elements for TreeSet time is:" +time11+" ms");
        compareSpeed.searchHash(treeSet,"received");
        System.out.println();


        System.out.println("*********************************************");
        long startTime12 = System.nanoTime();
        map = compareSpeed.addHashMapElement("elements.txt");
        long endTime12 = System.nanoTime();
        long time12 = endTime12-startTime12;
        System.out.println("Add the elements for the HashMap time is:" +time12+" ms");
        System.out.println();

        System.out.println("*********************************************");
        long startTime13 = System.nanoTime();
        compareSpeed.searchMap(map,"received");
        long endTime13 = System.nanoTime();
        long time13 = endTime13 - startTime13;
        System.out.println("Search the elements for HashMap time is:" +time13+" ms");
        System.out.println();

        System.out.println("*********************************************");
        long startTime14 = System.nanoTime();
        compareSpeed.deleteMap(map,"received");
        long endTime14 = System.nanoTime();
        long time14 = endTime14 - startTime14;
        System.out.println("Delete the elements for Hashmap time is:" +time14+" ms");
        compareSpeed.searchMap(map,"received");
        System.out.println();

        System.out.println("*********************************************");
        long startTime15 = System.nanoTime();
        treeMap = compareSpeed.addHashMapElement("elements.txt");
        long endTime15 = System.nanoTime();
        long time15 = endTime15-startTime15;
        System.out.println("Add the elements for the TreeMap time is:" +time15+" ms");
        System.out.println();

        System.out.println("*********************************************");
        long startTime16 = System.nanoTime();
        compareSpeed.searchMap(treeMap,"received");
        long endTime16 = System.nanoTime();
        long time16 = endTime16 - startTime16;
        System.out.println("Search the elements for TreeMap time is:" +time16+" ms");
        System.out.println();

        System.out.println("*********************************************");
        compareSpeed.searchMap(treeMap,"received");
        long startTime17 = System.nanoTime();
        compareSpeed.deleteMap(treeMap,"received");
        long endTime17 = System.nanoTime();
        long time17 = endTime17 - startTime17;
        System.out.println("Delete the elements for Treemap time is:" +time17+" ms");
        compareSpeed.searchMap(map,"received");
        System.out.println();


        //Compare the results
        System.out.println("*********************************************");
        compareSpeed.compareTime(time,time3,"ArrayList","LinkList","Add");
        System.out.println();
        compareSpeed.compareTime(time1,time4,"ArrayList","LinkList","Search");
        System.out.println();
        compareSpeed.compareTime(time2,time5,"ArrayList","LinkList","Delete");
        System.out.println();
        compareSpeed.compareTime(time6,time9,"HashSet","SetTree","Add");
        System.out.println();
        compareSpeed.compareTime(time7,time10,"HashSet","SetTree","Search");
        System.out.println();
        compareSpeed.compareTime(time8,time11,"HashSet","SetTree","Delete");
        System.out.println();
        compareSpeed.compareTime(time12,time15,"HashMap","MapTree","Add");
        System.out.println();
        compareSpeed.compareTime(time13,time16,"HashMap","MapTree","Search");
        System.out.println();
        compareSpeed.compareTime(time14,time17,"HashMap","MapTree","Delete");
        System.out.println();


    }
}
