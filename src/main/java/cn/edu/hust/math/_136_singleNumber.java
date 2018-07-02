package cn.edu.hust.math;

public class _136_singleNumber {
    //异或即可
    public int singleNumber(int[] nums) {
        if(nums==null|nums.length==0) return 0;
        for(int i=1;i<nums.length;i++)
        {
            nums[0]^=nums[i];
        }
        return nums[0];
    }
}
