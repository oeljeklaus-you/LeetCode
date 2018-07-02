package cn.edu.hust.math;

public class _69_mySqrt {
    //采用二分法
    public int mySqrt(int x) {
        if(x==0) return 0;
        int low=1;
        int high=x;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            //这里换一个思路解决是否是x的平方根
            if(mid<=x/mid&&x/(mid+1)<mid+1)
                return mid;
            else if(mid>x/mid)
            {
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return low;
    }
}
