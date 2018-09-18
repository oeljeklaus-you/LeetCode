package cn.edu.hust.array;

public class _33_search {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0) return -1;
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target) return mid;
                //证明后半段有序
            else if(nums[mid]<nums[high])
            {
                //这里证明在后半段
                if(nums[mid]<target&&nums[high]>=target) low=mid+1;
                else high=mid-1;
            }
            else
            {
                //证明在前半段
                if(nums[mid]>target&&nums[low]<=target) high=mid-1;
                else low=mid+1;
            }
        }
        return -1;
    }
}
