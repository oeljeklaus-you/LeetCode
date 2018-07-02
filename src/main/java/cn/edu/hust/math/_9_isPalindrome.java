package cn.edu.hust.math;

public class _9_isPalindrome {
    //使用异或判断
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        long result = 0;
        int p = x;
        while (p != 0) {
            result = result * 10 + (p % 10);
            if (result > Math.pow(2, 31) - 1) return false;
            p /= 10;
        }
        if ((result ^ x) == 0) return true;
        return false;
    }
}
