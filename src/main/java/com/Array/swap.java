package com.Array;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5,6};
        System.out.println(Arrays.toString(arr));
        swapArr(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }

    static void swapArr(int[]arr,int index1, int index2){
        int temp =arr[index1];
        arr[index1]=arr[index2];
        arr[index2]= temp;
    }
}
