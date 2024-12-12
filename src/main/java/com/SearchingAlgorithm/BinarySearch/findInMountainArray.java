package com.SearchingAlgorithm.BinarySearch;

public class findInMountainArray {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr,target));

    }


    public static int search(int[]arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target,0,peak);
        if(firstTry !=-1){
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBinarySearch(arr,target, peak+1, arr.length-1);

    }

    public static int peakIndexInMountainArray(int[]arr){
        int start= 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in decreasing part of the array
                //this may be the ans, but look at the left value
                // this is why end != min -1
                end = mid ;
            } else{
                //you ar in asc part of array
                start = mid +1; //because we know that mid+1 element >mid element
            }
        }
        //in the end. start == end and pointing to the largest number because of above to checks
        // start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just on element, that is the max one
        return end;
    }


    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){
//        int start = start;
//        int end = arr.length-1;

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
