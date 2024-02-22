package com.SearchingAlgorithm.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 56,78, 23, 89,84};
        int target = 9;
        System.out.println(linearSearch(arr,target,1,6));


    }

    public static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index=start; index <=end;index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        //this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }
}
