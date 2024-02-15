package com.switchCase;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId){
            case 1:
                System.out.println("Nanda");
                break;
            case 2:
                System.out.println("Rahul");
            case 3:
                switch (department){
                    case "IT3":
                        System.out.println("IT department");
                        break;
                    case "management":
                        System.out.println("Management department");
                    break;
                    default:
                        System.out.println("No Department");
                }
                break;
            default:
                System.out.println("No EmpId");
        }
    }
}
