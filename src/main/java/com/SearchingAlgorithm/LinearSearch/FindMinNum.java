package com.SearchingAlgorithm.LinearSearch;

public class FindMinNum {
    public static void main(String[] args) {
        //Q: find minimum element in the array
        //let consider Arr =[12,24,25,87,-9,10]
        //lets assume first element is minimum
        int[] arr ={12,24,25,87,-9,10};
        System.out.println(min(arr));

    }
    // assume arr.length !=0
    static int min(int[]arr){
        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
       return min;
    }
}
