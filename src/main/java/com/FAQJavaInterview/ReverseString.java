package com.FAQJavaInterview;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String input = "java is programing";
        System.out.println(reverseString(input));

    }

    public static String reverseString(String s){
        int n = s.length();
        String rev = "";
        for(int i=n-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        return rev;
    }
}
