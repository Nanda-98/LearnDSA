package com.Sorting.SelectionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class selectionSort {
    //selection sort = selecting an element and put it at it's correct position
    public static void main(String[] args) {
        int[] arr = {2, -30, 4, 1, -5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0; i<arr.length;i++){
            int lastIndex = arr.length-i-1;
            int maxIndex = maxIndex(arr,0,lastIndex);
            swap(arr,lastIndex,maxIndex);
        }
    }

    static int maxIndex(int[]arr, int start,int end){
        int max = 0;
        for(int i= start; i <=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}
