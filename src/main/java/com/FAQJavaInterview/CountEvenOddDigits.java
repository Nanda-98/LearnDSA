package com.FAQJavaInterview;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        int number = 1234567890;
        String answer  = countEvenOddDigit(number);

    }

    public static String countEvenOddDigit(int n){
        int countEven = 0;
        int countOdd = 0;
        while (n>0){
            int rem = n%10;
            if(rem%2==0){
                countEven++;
            }else {
                countOdd++;
            }
            n = n/10;
        }
        System.out.println("the count of even digits is: "+countEven);
        System.out.println("the count of odd digits is: "+countOdd);

        return null;
    }


}
