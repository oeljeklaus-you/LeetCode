package cn.edu.hust.array;

public class _33_search {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0) return -1;
        int low=0;
        int high=nums.length-1;
        /**
         * 由于是旋转的数组，所以一般的解法是二分法
         * 1.首先向二分法一样的解锁
         * 2。判断那一段有序，然后判断所要检索的目的是不是在这个范围内
         * 3。如果不再这个范围内那就检索下一段
         */
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
