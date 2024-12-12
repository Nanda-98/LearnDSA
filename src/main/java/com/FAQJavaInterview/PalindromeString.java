package com.FAQJavaInterview;

public class PalindromeString {
    public static void main(String[] args) {
        String input = "welcome";
        if(input.equals(palindromeString(input))){
            System.out.println("The given String "+input+" is Palindrome");
        }
        else {
            System.out.println("The given String "+input+" is not Palindrome");
        }
    }

    public static String palindromeString(String s){
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        return rev;
    }
}
