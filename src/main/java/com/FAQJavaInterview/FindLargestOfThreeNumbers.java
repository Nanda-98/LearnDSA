package com.FAQJavaInterview;

public class FindLargestOfThreeNumbers {
    public static void main(String[] args) {
        int a =3;
        int b =9;
        int c =5;
        int largest1 = a>b?a:b;
        int largest2 = c>largest1?c:largest1;

        System.out.println("The largest digit is: "+largest2);
    }

}
