package com.sunny;

public class ArraySample {

    public static void main(String[] args) {
        int[][] array2 = new int[4][5];
        int k = 0;
        
        for(int i=0; i <4; i++){
            for (int j=0; j<5; j++){
                array2[i][j] = k;
                k++;
                System.out.print(array2[i][j]+" ");
                System.out.println();
            }
        }
    }
}
