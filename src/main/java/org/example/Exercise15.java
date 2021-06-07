/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise15 {
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);

        String password = "abc$123";

        System.out.println("What is the password?");
        String userInput = scan.next();
        if (userInput.equals(password))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");
    }
}