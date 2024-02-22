package com.SearchingAlgorithm.LinearSearch;

//leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class ContainsEvenNumberOfDigits {
    public static void main(String[] args) {
        //Q: nums ={12,344,6784,1,23422,09}
        //find the number of elements in nums array with even number of digits.
        int[] nums ={1,-3444,684,10123,2342893,193};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums){
        int ans = 0;
        for(int num: nums){
            if(even(num)){
                ans++;
            }
        }
       return ans;
    }

    // function to check if number contains even digit or not
    public static boolean even(int num){
        if(num<0){
            num = num * -1;
        }
        if(num ==0){
            return false;
        }
        int even = 0;
        while (num>0){
            even++;
            num = num/10;
        }
        if((even%2)==0){
            return true;
        }
        return false;
    }


}
