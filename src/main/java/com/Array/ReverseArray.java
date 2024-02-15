package com.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
//two pointer method
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swapArr(arr,start,end);
            start++;
            end--;
        }
    }
    static void swapArr(int[]arr,int index1, int index2){
        int temp =arr[index1];
        arr[index1]=arr[index2];
        arr[index2]= temp;
    }
}
