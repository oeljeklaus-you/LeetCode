package cn.edu.hust.math;

public class _367_isPerfectSquare {
    //二分法,判断最后的结果是否是num的完全平方根
    public boolean isPerfectSquare(int num) {
        if(num==0) return true;
        int low=1;
        int high=num;
        int t=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            //这里换一个思路解决是否是x的平方根
            if(mid<=num/mid&&num/(mid+1)<mid+1)
            {
                t=mid;
                break;
            }
            else if(mid>num/mid)
            {
                high=mid-1;
            }
            else
                low=mid+1;
        }
        if(t*t==num||low*low==num) return true;
        return false;
    }
}
