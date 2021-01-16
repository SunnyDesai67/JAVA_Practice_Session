package com.sunny;

import java.io.*;
import java.util.Scanner;

public class InputOutputFileDemo {
    public static void main(String[] args) throws IOException {
        File empInformationFile = new File("/Users/sunny/IdeaProjects/SunnyPractice/JanPrac/src/com/SampleTextFile/EmpInfo.txt");
        InputOutputFileDemo demo1 = new InputOutputFileDemo();
        demo1.FileWrite(empInformationFile);

        InputOutputFileDemo demo2 = new InputOutputFileDemo();
        demo2.FileRead(empInformationFile);
    }

    public void FileWrite(File fileToWrite) {
        PrintWriter writeEmp = null;
        try {
            writeEmp = new PrintWriter(fileToWrite);
            //FileWriter empInfoWriter = new FileWriter(fileToWrite);
            writeEmp.println("Laxus");
            writeEmp.println("6767");

        } catch (FileNotFoundException e) {
            System.out.println("File is not found " + fileToWrite.getName());
            throw new RuntimeException(e);
        } finally {
            writeEmp.flush();
            writeEmp.close();
        }
    }

    public void FileRead(File empInfoRead) throws FileNotFoundException {

        Scanner input = new Scanner(empInfoRead);
        while (input.hasNext()) {
            System.out.println("Your Data: " + input.nextLine());
        }
    }
}