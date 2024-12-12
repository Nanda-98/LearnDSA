package com.FAQJavaInterview;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 124215;
        if(n==palindromeNumber(n)){
            System.out.println("given number "+n+ " is Palindrome");
        }
        else {
            System.out.println("given number "+n+ " is not a Palindrome");
        }

    }

    public static int palindromeNumber(int n){
        int rev =0;
        while (n>0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        return rev;
    }
}
