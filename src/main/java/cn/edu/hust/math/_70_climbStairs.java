package cn.edu.hust.math;

public class _70_climbStairs {
    //斐波拉契数列
    public int climbStairs(int n) {
        if(n<=2) return n;
        int first=1;
        int second=2;
        int count=2;
        while(count<n)
        {
            int tmp=first+second;
            first=second;
            second=tmp;
            count++;
        }
        return second;
    }
}
