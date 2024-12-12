package com.Sorting.BubbleSort;

import java.util.Arrays;

public class Bubblesort {
    //with the first pass through the array the largest element cam to end
    // known as sinking sort or exchange sort
    //best case O(N) worst case O(N*2)

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0; i<arr.length;i++){
            swapped = false;
            //for each step, max item will come at the last respective index
            for(int j=1; j<=arr.length -1; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }

            //if you did not swap for a particular value of i, it means the array is sorted hence stop the prgram
            if(swapped==false){ //!swapped
                break;
            }
        }
    }
}
