package cn.edu.hust.array;

public class _35_SearchInsert {
    //这里考察二分法，二分法必须是<=，而且当数组没有元素的时候，low是0或者length
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
}
