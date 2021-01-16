package com.sunny;

public class GenClass <T> {

    public T obj;
    void displayMethod(T obj)
    {
        this.obj = obj;
        System.out.println("Generic"+obj);
    }

    public static void main(String[] args) {
        GenClass<Integer> mainObj = new GenClass<Integer>();

        mainObj.displayMethod(10);
    }
}
