package dev.core.concepts.java;

import java.util.Scanner;

public class CreateTable {
    public static void main(String[] args) {
        System.out.println("HELLO SOHIT ! HOPE YOU ARE DOING GOOD AND ALSO YOUR STUDIES ARE GOING GOOD. ARE YOU GOOD IN MATHS");
        System.out.println("ENTER NUMBER TO PRINT TABLE OF NUMBER UPTO 10");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i= 1; i <=10; i++){
            System.out.println(number +" * " + i + " = " + number * i);
        }

//        System.out.println("HELLO SOHIT ! HOPE YOU ARE DOING GOOD AND ALSO YOUR STUDIES ARE GOING GOOD. ARE YOU GOOD IN MATHS");
//        6double num1 = Math.random();
//
//        double num2 = Math.random();
//
//        System.out.println(num1 + " * " + num2 + " = " + num1 * num2);


    }
}
