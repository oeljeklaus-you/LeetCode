package cn.edu.hust.array;

public class _53_MaxSubArray {
    //动态规划问题，主要是找出初状态和转化方程
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int result=Integer.MIN_VALUE;
        int curSum=0;
        for(int i=0;i<nums.length;i++)
        {
            curSum=Math.max(curSum+nums[i],nums[i]);
            if(curSum>result) result=curSum;
        }
        return result;
    }
}
