package com.FAQJavaInterview;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = input.nextInt();
        System.out.println(reverseNumber(number));

    }

    public static int reverseNumber(int n){
        int reverse = 0;
        while (n>0){
            int rem = n%10;
            reverse = (reverse*10)+rem;
            n = n/10;
        }
        return reverse;
    }
}