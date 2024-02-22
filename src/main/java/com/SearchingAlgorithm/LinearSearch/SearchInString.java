package com.SearchingAlgorithm.LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String str = "nanda kumar";
        char target = 'j';
        System.out.println(searchChar(str,target));

    }

    public static boolean searchChar2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if ( ch == target){
                return true;
            }
        }
        return false;
    }

    public static boolean searchChar(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i =0;i<str.length();i++){
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
