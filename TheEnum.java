package com.DataStructure;

import java.util.Enumeration;
import java.util.Vector;

public class TheEnum {
    public static void main(String[] args) {

        Enumeration eobj;
        Vector vobj = new Vector();

        vobj.add("Dell");
        vobj.add("HP");
        vobj.add("Lenovo");
        vobj.add("Apple");
        eobj = vobj.elements();

        while (eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }
    }
}