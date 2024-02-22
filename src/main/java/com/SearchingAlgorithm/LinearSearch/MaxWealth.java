package com.SearchingAlgorithm.LinearSearch;

// leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] acc = {{1,2,3},
                       {3,4,5,6},
                       {1,2,3,4}};
        int max = maxWealth(acc);
        System.out.println(max);
    }

    public static int maxWealth(int[][]acc){
        int ans = Integer.MIN_VALUE;
        for(int person=0;person<acc.length;person++){
            int rowSum = 0;
            for(int account=0;account<acc[person].length;account++){
                rowSum += acc[person][account];
            }
            if (rowSum>ans){
                ans = rowSum;
            }
        }
        return ans;
    }
}
