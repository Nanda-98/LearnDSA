package com.basic;

public class ReverseNum {
    public static void main(String[] args){
        int n = 23456;
        int reverse = 0;
        while(n>0){
            int rem = n % 10;
            n = n/10;
            reverse = (reverse*10)+rem;
        }
        System.out.println(reverse);
    }
}
