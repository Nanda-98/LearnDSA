package com.SearchingAlgorithm.BinarySearch;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        int target = 6;
        int ans = orderAgnosticBinarySearch(arr,target);
        System.out.println(ans);
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //find whether the array is sorted in ascending or descending
        boolean isAscending = arr[start]<arr[end];

        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAscending){
                if(target<arr[mid]){
                    end = mid-1;
                }else if(target>arr[mid]){
                    start = mid+1;
                }
            }
            else {
                if(target<arr[mid]){
                    start = start+1;
                }else if(target>arr[mid]){
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
