package com.DataStructure;

import java.util.BitSet;

public class SetBits {
    public static void main(String[] args) {

        BitSet BS1 = new BitSet(15);
        BitSet BS2 = new BitSet(15);

        for(int i = 0 ; i<15 ; i++){
            if(i%2 == 0) BS1.set(i);
            if (i%5 == 0) BS2.set(i);
        }
        System.out.println("Initial" + BS1);
        System.out.println("Initial2" + BS2);

        //AND MEthod
        BS1.and(BS2);
        System.out.println("AND: " +BS1);

        //OR MEthod
        BS1.or(BS2);
        System.out.println("OR: "+ BS2);

        //XOR Method
        BS1.xor(BS2);
        System.out.println("XOR: "+BS1);
    }
}
