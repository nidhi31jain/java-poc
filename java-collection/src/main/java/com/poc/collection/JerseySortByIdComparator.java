package com.poc.collection;

import java.util.Comparator;

public class JerseySortByIdComparator implements Comparator {

    public int compare(Object object1, Object object2) {
        int value = 0;
        Jersey jersey1 = (Jersey)object1;
        Jersey jersey2 = (Jersey)object2;
        if ((jersey1.getId()) > (jersey2.getId())){
            value = -1;
        } else if ((jersey1.getId()) < (jersey2.getId())){
            value = 1;
        }
        return value;
    }
}
