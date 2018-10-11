package cn.edu.hust.array;

public class _42_trap {
    //解题思路是:双指针法，可以记下这个数组的两端最大值，然后进行判断
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftMax=0,rightMax=0;
        int result=0;
        /**
         * 接雨水，这道题怎么解题呢？
         * 1。需要足以的是在两端都是柱子的情况下，小的柱子决定了雨水的多少
         * 2。如果中间的柱子大于小柱子，那就蓄水
         * 3。如果中间的柱子小于小柱子，那就更新
         */
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
