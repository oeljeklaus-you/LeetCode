package cn.edu.hust.math;

public class _371_getSum {
    //先异或找到和，在进行&和<<得到进位
    public int getSum(int a, int b) {
        while(b!=0)
        {
            int tmp=a^b;
            b=(a&b)<<1;
            a=tmp;
        }
        return a;
    }
}
