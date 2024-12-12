package com.FAQJavaInterview;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int number = 123456;
        System.out.println(countDigit(number));

    }

    public static int countDigit(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
}
