package com.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
               sum();
               int ans = sum3(23, 34);
               System.out.println(ans);

    }

    //function format
    // access modefier reeturn type name (){ body return statement}

    public static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum is: " + sum);
    }

    public static int sum3(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}
