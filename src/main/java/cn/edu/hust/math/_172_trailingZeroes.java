package cn.edu.hust.math;

public class _172_trailingZeroes {
    //解题思路:https://www.cnblogs.com/hutonm/p/5624996.html
    public int trailingZeroes(int n) {
        int result=0;
        while(n>=5)
        {
            n/=5;
            result+=n;
        }
        return result;
    }
}
