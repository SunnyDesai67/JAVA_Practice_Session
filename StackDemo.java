package com.DataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        StackDemo StDem = new StackDemo();
        Stack st = new Stack();
        StDem.pushMethod(st, 67);
        StDem.pushMethod(st, 67);
        StDem.pushMethod(st, 88);
        StDem.pushMethod(st, 14);
        StDem.pushMethod(st, 06);
        StDem.popMethod(st);
        StDem.popMethod(st);

        Map m = new HashMap();
        m.put("Taxi",14);
        System.out.println("Map:"+m);

    }
    static void pushMethod(Stack st, int b){
        st.push(new Integer (b));
        System.out.println("Stack: " + st);
        System.out.println("Push Element" + b);
    }
    static void popMethod(Stack st)
    {
        Integer i = (Integer) st.pop();
        System.out.println("Pop Element:" +i);
        System.out.println("Stack: " + st);
    }
}
