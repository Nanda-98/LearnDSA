package com.FAQJavaInterview;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 87;
        int count = 0;
        if(number>1){
            for(int i=1;i<=number;i++){
                if(number%i==0)
                    count++;
            }
            if(count==2){
                System.out.println("The number is prime");
            }
            else{
                System.out.println("The number is not prime");
            }
        }
        else {
            System.out.println("The given number "+number+" is not prime");
        }
    }
}
