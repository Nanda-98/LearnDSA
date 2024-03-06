package com.SearchingAlgorithm.BinarySearch;
//www.geeksforgeeks.org/find-position-element-sorted-array-infinite-number
public class infiniteRangeArrayBinarySearch {
    public static void main(String[] args) {
       int[] arr ={3,5,7,9,10,90,100,130,140,160,170,190,200,201};
       int target = 160;
       System.out.println(findingAns(arr,target));
    }

    static int findingAns(int[]arr, int target){
        //start with the box of 2;
        //first start with a box of size 2;
        int start =0;
        int end = 1;
        //condition for target to lie in the range->target should be less than end
        //if the target element is greater than end we double the range to find the range, if target element is less than end it's some where in the range and apply binary search
        while (target>arr[end]){
            int newStart = end+1;
            //double the box Value
            //end = previous end + sizeOfBox*2
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return infiniteArray(arr,target,start,end);
    }
    public static int infiniteArray(int[]nums, int target, int start, int end){
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
}
