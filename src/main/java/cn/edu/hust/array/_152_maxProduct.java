package cn.edu.hust.array;

public class _152_maxProduct {
    /**
     * 如何解决连续子数组之积最大的问题呢
     * 1。由于存在负数，那么可能存在以后的最小值乘以当前的值得到最大值
     * 2。基于以上这种考虑，那么就要保存最小值和最大值了
     * 3。最小值和最大值以及现在的值的最大值
     * 4。计算最小值和最大值以及当前的值的最小值
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int tmp=max;
            max=max*nums[i];
            min=min*nums[i];
            max=Math.max(Math.max(max,min),nums[i]);
            min=Math.min(Math.min(tmp*nums[i],min),nums[i]);
            result=Math.max(max,result);
        }
        return result;
    }
}
