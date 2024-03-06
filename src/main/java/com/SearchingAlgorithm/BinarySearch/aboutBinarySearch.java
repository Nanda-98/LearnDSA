package com.SearchingAlgorithm.BinarySearch;

public class aboutBinarySearch {
    //Binary search is used on sorted array in ascending or descending order
    //arr=[2,4,6,9,11,12,14,20,36,48] -> sorted array
    //Q find whether 36 is present in the arr.
    //binary search
    //1) find the middle element
    //2) target>mid -> search in the right part of the middle element
    //   else search in the left part of the middle element
    //3) if middle element == target element then that is the answer.
    //Why Binary search?
    //Best scenario: O(1) Worst case: O(logN) -> where we find the number of levels it took to find the target element
    //for a range of 1 million elements Linear search will make 1 millions steps to find the element in worst case scenario, but binary search will take 20 steps to find the target element


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    //return the index of the target element
    //return -1 if the target element does not exist
    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
