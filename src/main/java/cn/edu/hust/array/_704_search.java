package cn.edu.hust.array;

public class _704_search {
    //二分法
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                return mid;
            }else if(nums[mid]>target)
            {
                high=mid-1;
            }else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                return -1;
            }
        }
        return -1;
    }
}
