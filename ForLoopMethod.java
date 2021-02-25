package com.sunny;

import java.util.Scanner;

public class ForLoopMethod {

    public void ForLoopOrder()
    {

        // 1. For loop to manage order in
        int symbol, temp;                               // take two integer one for the take element and second for the compare
        Scanner sc = new Scanner(System.in);

        System.out.print("enter integer element: ");
        symbol = sc.nextInt();
        int num[] = new int[symbol];                   // simple num array include integer and data as in symbol

        System.out.println("Enter array element: ");       // check input element number with a given array index is same
        for (int i = 0 ; i<symbol; i++){
            num[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0 ; i<symbol ; i++)                   // checking two array integer element
        {
            for (int j = 0; j < i; j++)
            {
                if (num[i] > num[j])                    // if taking element is greater than next element than switch
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for(int i = 0; i < symbol - 1; i++)             // print is submitted element into the seq.
        {
            System.out.print(num[i]+",");
        }
        System.out.print(num[symbol - 1]);
    }

    public static void main(String[] args) {

        ForLoopMethod FLM = new ForLoopMethod();
        FLM.ForLoopOrder();
    }
}