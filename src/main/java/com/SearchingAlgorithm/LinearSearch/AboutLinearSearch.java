package com.SearchingAlgorithm.LinearSearch;

public class AboutLinearSearch {
    //Linear search is a basic algorithm
    //arr=[18, 12, 24, 16, 17, 19]
    //Q: find if exists in arr or not
    //we can access every element of arr using index values or using for each loop to iterate around itself
    //linear search says start searching from first elements still you find the required element.
    // time complexity: best case: O(1)(constant) worst case: O(n)

    public static void main(String[] args) {
        int[] arrNums = {1, 23, 45, 67, 8, 92, 45, 24, 90};
//        int target = 0;
//        int ans = linearSearch(arrNums,target);
//        System.out.println(ans);
        int targetElement = 6;
        int ans1 = linearSearch2(arrNums,targetElement);
        System.out.println(ans1);

    }

    //search the target and return the element
    public static int linearSearch2(int[] arr, int targetElement){
        if(arr.length == 0){
            return -1;
        }
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == targetElement) {
                return element;
            }
        }
        //this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }

     // search in teh array: return the index if item is found
    // otherwise if item is  not found return -1
     public static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0; index <arr.length;index++){
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
