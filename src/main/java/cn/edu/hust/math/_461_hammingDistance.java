package cn.edu.hust.math;

public class _461_hammingDistance {
    //使用异或计算二进制中1的个数即可
    public int hammingDistance(int x, int y) {
        int t=x^y;
        int count=0;
        while(t!=0)
        {
            t=t&(t-1);
            count++;
        }
        return count;
    }
}
