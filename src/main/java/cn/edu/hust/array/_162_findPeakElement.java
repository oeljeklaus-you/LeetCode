package cn.edu.hust.array;

public class _162_findPeakElement {
    /**
     * 针对于极小值极大值的求法，可以使用二分
     * 1。假设下标值为0和length的值为无穷小，那么肯定村子极大值
     * 2。使用二分法，如果nums[mid]>=nums[mid-1] 那么至少nums[mid]是一个极大值则low=mid
     * 3。如果nums[mid]<nums[mid]那么至少nums[mid-1]是极大值则high=mid-1
     * 4。需要注意的是当只有两个元素的时候直接返回
     * @param nums
     * @return
     */
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
                high=mid-1;
        }
        return low;
    }
}
