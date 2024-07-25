package com.FAQJavaInterview;

import java.util.Arrays;

public class MaxItem {
    public static void main(String[] args) {
        int [] arr = { 1,122,8,45,87};
        System.out.println(Arrays.toString(arr));
        int ans = maxItem(arr);
        System.out.println(ans);


    }

    @org.jetbrains.annotations.Contract(pure = true)
    static int maxItem( int[] arr){
        int max = arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }
}
