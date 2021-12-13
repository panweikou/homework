package com.epam.week1;

import java.util.Collections;
import java.util.List;

public class FindSecondLength {
    public FindSecondLength() {}

    /**
     * Sort the string length.
     * @param list
     * @return
     */
     public List<String> listSearch(List<String> list) {
        for(int i=0;i<list.size()-1;i++) {
            for(int j=0;j<list.size()-i-1;j++) {
                if(list.get(j).length()<list.get(j+1).length()) {
                    Collections.swap(list,j,j+1);
                }
            }
        }
        return list;
    }

    public String returnString(List<String> list) {
         String str = "";
        if(list.get(1).length()==list.get(2).length()) {
            str = list.get(1)+" "+list.get(2);
        } else {
            str = list.get(1);
        }
        return str;
    }

    /**
     * Print the list
     * @param list
     */
    public void printList(List<String> list) {
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
