package cn.edu.hust.math;

public class _342_isPowerOfFour {

    //解题思路:4的幂是二进制中只有一个1，后面的0的个数是偶数个
    //判断位中1的个数
    public boolean haveOne(int num)
    {
        int count=0;
        while(num!=0)
        {
            num=num&(num-1);
            count++;
        }
        return count==1;
    }
    public boolean isPowerOfFour(int num) {
        if(num<=0) return false;
        int count=0;
        while((num&1)!=1){
            count++;
            num=num>>1;
        }
        return (count%2==0)&&haveOne(num);
    }
}
