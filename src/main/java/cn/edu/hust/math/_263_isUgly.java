package cn.edu.hust.math;

public class _263_isUgly {
    //这是第一种解法
    public boolean isUgly(int num) {
        if(num==0) return false;
        while(num%2==0)
            num/=2;
        while(num%3==0)
            num/=3;
        while(num%5==0)
            num/=5;
        return num==1?true:false;
    }
}
