package com.Array;

public class ReplaceNum {
    public static void main(String[] args) {
        int n = 1001;
        int ans = replaceByFive(n);
        System.out.println(ans);
    }

    static int replaceByFive(int n) {
        int ans = 0;
        int factorial = 1;
        if (n == 0) {
            return 5;
        }
        while (n > 0) {
            int rem = n % 10;
            if (rem == 0) {
                ans += 5 * factorial;
            } else {
                ans += rem * factorial;
            }
            n = n/10;
            factorial = factorial*10;
        }
        return ans;
    }
}
