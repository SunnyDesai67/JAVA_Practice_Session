package com.sunny;

public class ExceptionHandling {

    public static void main(String[] args) {
        int demo = 0;
        int ar = 22;
        int aa[] = {1, 2, 3};

        try {
            if (demo == 0) {
                throw new Exception("Positive int only");
            }
            int result = ar / demo;
            System.out.println(result);
            try {
                System.out.println(aa[3]);
            }catch (ArithmeticException e){
                System.out.println("ArithmeticException here");
            }
        }
            catch (ArithmeticException ae) {
                System.out.println("ArithmeticException " + ae.getMessage());
            } catch (ArrayIndexOutOfBoundsException aioe) {
                System.out.println("ArrayIndexOutOfBoundException " + aioe.getMessage());
            } catch (Exception e){
            System.out.println("Generic exception");
        }
    }
}