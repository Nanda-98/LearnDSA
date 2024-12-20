package com.SearchingAlgorithm.BinarySearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class searchInRotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};
        int target = 1;

        System.out.println(search(arr,target));
    }

    public static  int search(int[] nums, int target){
        int pivot = findPivot(nums);
        if(pivot==-1){
            //just do normal binary search
            return binarySearch(nums,target,0,nums.length-1);
        }
        //if pivot is found, we have 2 asc array
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);

    }

    public static int binarySearch(int[]nums, int target, int start, int end){
        while (start<=end){
            int mid = start +(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    //this will not work for duplicate values
    public static int findPivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            // 4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
