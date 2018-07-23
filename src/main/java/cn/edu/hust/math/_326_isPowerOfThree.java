package cn.edu.hust.math;

public class _326_isPowerOfThree {
    //使用循环即可
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        else if(n==1) return true;
        while(n%3==0&&n>3)
        {
            n=n/3;
        }
        if(n==3) return true;
        return false;
    }

    public boolean isPowerOfThree2(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return ( n>0 &&  1162261467%n==0);
    }
}
