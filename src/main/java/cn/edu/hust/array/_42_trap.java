package cn.edu.hust.array;

public class _42_trap {
    //解题思路是:放指针法，可以记下这个数组的两端最大值，然后进行判断
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftMax=0,rightMax=0;
        int result=0;
        while(left<right)
        {
            //如果左边的小于右边的值,这个是前提，那么就可以使用最小值得到存储量
            if(height[left]<height[right])
            {
                //如果这个值比最大的还大，那么肯定是不能接水的
                if(height[left]>=leftMax)
                    leftMax=height[left];
                else
                    result+=leftMax-height[left];
                left++;
            }
            else
            {
                if(height[right]>=rightMax)
                    rightMax=height[right];
                else
                    result+=rightMax-height[right];
                right--;
            }
        }
        return result;
    }
}
