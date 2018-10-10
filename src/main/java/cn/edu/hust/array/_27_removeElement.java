package cn.edu.hust.array;

public class _27_removeElement {
    public int removeElement(int[] nums, int val) {
        if(nums==null||nums.length==0) return 0;
        int j=0;
        /**
         * 和移除重复元素一样需要删除元素，不一样的是这次直接是覆盖后加即可
         */
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}
