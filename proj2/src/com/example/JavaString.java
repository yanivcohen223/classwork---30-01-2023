package com.example;
//26 page 11
import java.util.Arrays;

public class JavaString {
    public static void main(String[] args) {
        String str = "yaniv.cohen";

        String[] strPart = str.split("[.]",0);
        String fName = strPart[0];
        String lName = strPart[1];

        System.out.format("Welcome to the course: your first name is: %s and your last name is: \n" +
                "%s ", fName, lName);
    }

}
