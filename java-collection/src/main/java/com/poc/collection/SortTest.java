package com.poc.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortTest {
    public static void main(String args[]){

        List<Jersey> jerseyList = new ArrayList<Jersey>();

        Jersey jersey1 = new Jersey(1, "M", "Lee", "London", "2019", "SHORT", "MALE");
        jerseyList.add(jersey1);
        Jersey jersey2 = new Jersey(5, "S", "Star", "London", "2019", "SHORT", "MALE");
        jerseyList.add(jersey2);
        Jersey jersey3 = new Jersey(2, "L", "Lee", "London", "2019", "SHORT", "MALE");
        jerseyList.add(jersey3);
        Jersey jersey4 = new Jersey(3, "M", "Star", "London", "2019", "SHORT", "MALE");
        jerseyList.add(jersey4);
        Jersey jersey5 = new Jersey(4, "L", "Nike", "London", "2019", "SHORT", "MALE");
        jerseyList.add(jersey5);


        JerseySortByIdComparator jerseySortByIdComparator = new JerseySortByIdComparator();
        Collections.sort(jerseyList,jerseySortByIdComparator);
        System.out.println(jerseyList);


    }
}
