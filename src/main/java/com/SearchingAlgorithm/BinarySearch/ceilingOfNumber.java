package com.SearchingAlgorithm.BinarySearch;

public class ceilingOfNumber {
    //If you find a sorted array apply binary search.
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,10,10,12,14};
        int target = 3;
        int ans= ceilingOfNumber(arr,target);
        System.out.println(ans);

    }

    //Q: ceiling-> smallest element in the array greater than or equal to target
    public static int ceilingOfNumber(int[] arr,int target){
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
        return arr[start];
    }

}
