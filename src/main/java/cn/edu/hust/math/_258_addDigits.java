package cn.edu.hust.math;

public class _258_addDigits {
    //通过枚举克制是9的倍数
    public int addDigits(int num) {
        if(num==0) return 0;
        return num%9==0?9:(num%9);
    }
}
