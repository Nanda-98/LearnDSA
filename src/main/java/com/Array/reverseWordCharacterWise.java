package com.Array;

public class reverseWordCharacterWise {
    public static void main(String[] args) {
        String givenWord = "Nanda Kumar";
        System.out.println(reverseWord(givenWord));
    }

    public static String reverseWord(String name) {
        String[] words = name.split(" ");
        String output = "";
        for (String word : words) {
            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord += word.charAt(i);
            }
            output += reverseWord + " ";
        }
        return output;
    }
}
