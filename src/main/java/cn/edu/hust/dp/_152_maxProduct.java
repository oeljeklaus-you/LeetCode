package cn.edu.hust.dp;

public class _152_maxProduct {
    //解题思路:需要保存最大值和最小值，但是需要注意的是要保存前一个最大值因为有负数
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int tmp=max;
            max=max*nums[i];
            min=min*nums[i];
            //保存最大值
            max=Math.max(Math.max(max,min),nums[i]);
            //比较前一个最大值的乘积和现在的最小值
            min=Math.min(Math.min(tmp*nums[i],min),nums[i]);
            result=Math.max(max,result);
        }
        return result;
    }
}
