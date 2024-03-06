package com.SearchingAlgorithm.BinarySearch;

public class floorOfNumber {

    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,10,10,12,14};
        int target = 3;
        int ans= floorOfNumber(arr,target);
        System.out.println(ans);

    }

    //Q: ceiling-> greatest element in the array smaller than or equal to target
    public static int floorOfNumber(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = end-1;
            }
            else return arr[mid];
        }
        return arr[end];
    }
}
