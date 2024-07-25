package com.FAQJavaInterview;

public class SumOfDigit {
    public static void main(String[] args) {
        int number = -1234;
        System.out.println(sumOfDigit(number));

    }

    public static int sumOfDigit(int n){
        int sum = 0;
        if(n<0){
            sum = -1;
        }
        while (n>0){
            int rem = n%10;
            sum = sum+rem;
            n=n/10;
        }
        return sum;
    }
}
