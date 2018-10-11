package cn.edu.hust.array;

public class _81_serach {
    //这里需要考虑出现重复情况，如果含有重复元素，有可能那就一个一个比较
    public boolean search(int[] nums, int target) {
        /**
         * 具体解题思路和前面的相同：这里需要注意的是【3，1】，求解1这种情况，
         */
        if(nums==null) return false;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target) return true;
            else if(nums[start]==nums[mid]) start++;
            else if(nums[start]<nums[mid])
            {
                if(target>=nums[start]&&target<nums[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }
            else
            {
                if(target>nums[mid]&&target<=nums[end])
                    start=mid+1;
                else
                    end=mid-1;
            }
        }
        return false;
    }
}
