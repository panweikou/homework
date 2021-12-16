package com.epam.week2;

import java.io.*;
import java.util.*;

public class CompareSpeed {
    public CompareSpeed() {}

    /**
     * Add the elements to the ArrayList and LinkList
     * @param file
     * @return
     * @throws IOException
     */
    public List<String> addElement( String file) throws IOException {
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        List<String> list = new ArrayList<String>();
        String string = null;
        while ((string = br.readLine()) !=null) {
            list.add(string);
        }
        br.close();
        reader.close();
        return list;
    }


    /**
     * Search the ArrayList or Linklist
     * @param list
     */
    public void getListElement(List<String> list, String element) {
        boolean searchfind = false;
        for(int i=0;i<list.size();i++) {
            if(list.get(i).contains(element)) {
                searchfind = true;
                break;
            }
        }
        if(searchfind == true) {
            System.out.println("Find it");
        } else {
            System.out.println("Cannot find it");
        }
    }

    /**
     * Delete the ArrayList or Linklist
     * @param list
     */
    public void delListElement(List<String> list,String element) {
        Iterator<String> it = list.listIterator();
        for(int i=0;i<list.size();i++) {
            if(list.get(i).contains(element)) {
                list.remove(i);
            }
        }
    }

    /**
     *Add the element to the Linklist
     */
    public LinkedList<String> addLinkList(String file) throws IOException {
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        LinkedList<String> linkedList = new LinkedList<String>();
        String string = null;
        while ((string = br.readLine()) !=null) {
            linkedList.add(string);
        }
        br.close();
        reader.close();
        return linkedList;
    }

    /**
     * Compare the time for the options
     */
    public void compareTime(long time1, long time2, String type1, String type2, String options) {
        long compareTime = time1 - time2;
        if(compareTime>0) {
            System.out.println(options+" elements for the "+type1+" spends much more time than "+type2);
        } else if(compareTime==0){
            System.out.println(options+" elements for the "+type1+" spends equal to "+type2);
        } else {
            System.out.println(options+" elements for the "+type1+" spends less time than "+type2);
        }
    }


    /**
     * Add the elements for HashSet or SetTree
     */
    public Set<String> addHashElement(String file) throws IOException {
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        Set<String> hashSet = new HashSet<String>();
        String string = null;
        while ((string = br.readLine()) !=null) {
            hashSet.add(string);
        }
        br.close();
        reader.close();
        return hashSet;
    }

    /**
     * Search the elements for hashset or HashTree
     */
    public void searchHash(Set<String> set,String search) {
        boolean findit = false;
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if(it.next().contains(search)) {
                findit = true;
                break;
            }
        }
        if(findit==true) {
            System.out.println("find it");
        } else {
            System.out.println("Cannot find it");
        }
    }

    /**
     * Delete the element for hashset or HashTree
     */
    public void deleteHash(Set<String> set,String search) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if(it.next().contains(search)) {
                System.out.println("Delete successfully");
                it.remove();
                break;
            }
        }
    }

    /**
     * Add the elements for HashMap or TreeMap
     */
    public Map<String,String> addHashMapElement(String file) throws IOException {
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        Map<String,String> hashMap= new HashMap<String,String>();
        String string = null;
        while ((string = br.readLine()) !=null) {
            hashMap.put(string,string);
        }
        br.close();
        reader.close();
        return hashMap;
    }

    /**
     * Search the elements for hashmap or TreeMap
     */
    public void searchMap(Map<String,String> map,String search) {
        boolean find = false;
        Iterator<String> iterator = map.values().iterator();
        while (iterator.hasNext()){
            if(iterator.next().contains(search)) {
                find = true;
                break;
          }
      }
        if(find == true) {
            System.out.println("Find it");
        } else {
            System.out.println("Cannot find it");
        }
    }

    /**
     * Search the elements for hashmap or TreeMap
     */
    public void deleteMap(Map<String,String> map,String search) {
        Iterator<String> iterator = map.values().iterator();
        while (iterator.hasNext()){
            if(iterator.next().contains(search)) {
                iterator.remove();
                System.out.println("delete it successfully");
                break;
            }
        }
    }


    public void listshow(List<String> list) {
        for(int i =0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }





}