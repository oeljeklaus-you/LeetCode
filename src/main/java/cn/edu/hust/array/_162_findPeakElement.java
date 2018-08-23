package cn.edu.hust.array;

public class _162_findPeakElement {
    //解题思路就是根据定义解析即可
    public int findPeakElement(int[] nums) {
        //解题思路，我们需要自定义nums[i-1]<nums[i]
        int low=0;
        int high=nums.length-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(high-low==1)
                return nums[high]>nums[low]?high:low;
            if(nums[mid-1]<=nums[mid])
                low=mid;
            else if(nums[mid]<nums[mid-1])
                high=mid;
        }
        return low;
    }
}
