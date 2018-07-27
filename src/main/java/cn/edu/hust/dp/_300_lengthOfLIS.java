package cn.edu.hust.dp;

public class _300_lengthOfLIS {
    //解题思路:针对于动态规划一般的思路是求解初始化值和状态转化方程
    public int lengthOfLIS(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int len=0;
        int d[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            d[i]=1;
            //和前面每一个对比计算出最大的值
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j]&&d[j]+1>d[i])
                    d[i]=d[i]+1;
            }
            if(d[i]>len) len=d[i];
        }
        return len;
    }
}
