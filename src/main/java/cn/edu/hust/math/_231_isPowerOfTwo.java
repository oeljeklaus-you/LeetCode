package cn.edu.hust.math;

public class _231_isPowerOfTwo {
    //2的幂位中只有一个1
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        if (count == 1) return true;
        return false;
    }
}
