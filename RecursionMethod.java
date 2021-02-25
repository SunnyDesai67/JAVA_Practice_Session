package com.sunny;

import java.util.Scanner;

public class RecursionMethod {
    int factorial(int i) {
        int factorial = 0;
        if (i == 0 || i == 1) return 1;
        else {
            factorial = factorial(i - 1) * i;
            return factorial;
        }
    }

    public static void main(String[] args) {
        RecursionMethod RM = new RecursionMethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter integer number: ");
        int n = sc.nextInt();
        System.out.println(RM.factorial(n));
    }
}