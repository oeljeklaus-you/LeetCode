package cn.edu.hust.math;

public class _191_hammingWeight {
    // 位运算
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0)
        {
            n&=(n-1);
            count++;
        }
        return count;
    }
}
