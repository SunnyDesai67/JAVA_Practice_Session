package com.DataStructure;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashClassDemo {
    private Hashtable hashtableObj;

    public static void main(String[] args) {
        Hashtable hashtableObj;
        hashtableObj = new Hashtable();
        Enumeration eNumeration = hashtableObj.keys();
        double dob;
        String str;

        hashtableObj.put("Sunny", new Double(1222.111));
        hashtableObj.put("Vasu", new Double(1000.222));
        hashtableObj.put("Het", new Double(20000.333));

        eNumeration = hashtableObj.keys();

        while (eNumeration.hasMoreElements()) {
            str = (String) eNumeration.nextElement();
            System.out.println("Balance " + hashtableObj.get(str));
        }

        dob = ((Double) hashtableObj.get("Vasu")).doubleValue();
        hashtableObj.put("Vasu", new Double(dob + 2000));
        System.out.println("New Balance " + hashtableObj.get("Vasu"));

    }
}

