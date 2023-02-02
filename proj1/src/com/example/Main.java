package com.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        Scanner num = new Scanner(System.in);

        System.out.println("Please enter number 1 :");
        int a = num.nextInt();
        System.out.println("Please enter number 2 :");
        int b = num.nextInt();

        if (a > b) {
            System.out.format(" %d > %d !",a, b);
        }
        else {
            System.out.format(" %d > %d !",b, a);
        }

    }
}