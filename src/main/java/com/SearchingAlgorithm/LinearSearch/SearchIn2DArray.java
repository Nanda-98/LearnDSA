package com.SearchingAlgorithm.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {{1,34,56,101},
                        {12, 45, 78, 89},
                        {8, 90, 78, 65, 45 }};
        int target = 34;
        System.out.println(search2DArray(arr,target));
        int[] ans = search2DArray1(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(search2DArrayMax(arr));
    }

    //iterating through 2D array
    public static boolean search2DArray(int[][]arr,int target){
        for(int row=0; row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return true;
                }
            }
        }
        return false;
    }

    //index of the target array
    public static int[] search2DArray1(int[][]arr,int target){
        for(int row=0; row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{0, 0};
    }

    //max item in the 2D array
    public static int search2DArrayMax(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                if (ints[col] > max) {
                    max = ints[col];
                }
            }
        }
        return max;
    }
}
