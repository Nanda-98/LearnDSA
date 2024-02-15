package com.switchCase;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case "mango":
                System.out.println("King of fruit");
                break;
            case  "apple":
                System.out.println("red colour fruit");
                break;
            case  "orange":
                System.out.println("round fruit");
                break;
            case  "grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("please enter a fruit");
        }

    }
}
