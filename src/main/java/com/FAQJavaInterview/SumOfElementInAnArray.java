package com.FAQJavaInterview;

public class SumOfElementInAnArray {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        int sum = 0;
        for (int i=0;i<=number.length-1;i++){
            sum=sum+number[i];
        }
        System.out.println("the sum of array is "+sum);
    }
}
