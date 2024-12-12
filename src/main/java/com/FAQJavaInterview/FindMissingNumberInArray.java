package com.FAQJavaInterview;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] number = {1,2,4,5};
        int sum1=0;
        int sum2=0;
        for(int i=0;i<=number.length-1;i++){
            sum1=sum1+number[i];
        }

        for(int i=0;i<=5;i++){
            sum2=sum2+i;
        }
        int missingnumber = sum2-sum1;
        System.out.println("The missing number is "+missingnumber);

    }

}
