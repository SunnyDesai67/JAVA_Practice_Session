package com.sunny;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMethod {

    public static void main(String[] args) {

        String pattern = "[a-zHO]";
        String checker = "Hi hellO";

        Scanner scnr = new Scanner(System.in);

        Pattern ptrn = Pattern.compile(pattern);
        Matcher mthcr = ptrn.matcher(checker);

        if(mthcr.find()){
            System.out.println("Perfect " + checker.substring( mthcr.start(), mthcr.end()));
        }
        else{
            System.out.println("try again");
        }
    }
}
