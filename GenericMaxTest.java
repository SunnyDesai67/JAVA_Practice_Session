package com.sunny;

public class GenericMaxTest {
    
    public static <T extends Comparable<T>> T GenMethod(T x1, T x2, T x3){
        
        T obj = x3;
        
        if(x2.compareTo(obj) > 0);
        {
            obj = x2;
        }
        if(x1.compareTo(obj) > 0);
        {
            obj = x1;
        }
        return obj;
    }

    public static void main(String[] args) {
        //GenericMaxTest genericMaxTest = new GenericMaxTest();
        System.out.printf("%d, %d and %d maximum is %d\n", 4,5,6, GenericMaxTest.GenMethod(4,5,6));
        System.out.printf("%.1f, %.1f and %.1f max is %.1f\n", 5.5, 6.3,2.2, GenericMaxTest.GenMethod(8.5,6.3,7.2));
        System.out.printf("%s, %s and %s max is %s \n", "...","..",".", GenericMaxTest.GenMethod("...","..","."));
    }
}