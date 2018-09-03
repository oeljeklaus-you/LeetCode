package cn.edu.hust.array;

public class _215_findKthLargest {
    public int findKthLargestHelper(int[] nums,int start,int end,int k)
    {
        int low=start;
        int high=end;
        int target=nums[start];
        //注意是最大的，需要逆序
        while(low<high)
        {
            while(low<high&&nums[high]<=target)
                high--;
            nums[low]=nums[high];
            while(low<high&&nums[low]>=target)
                low++;
            nums[high]=nums[low];
        }
        nums[low]=target;
        //这里一定要算起始地址
        if(low-start==k-1) return nums[low];
        //这里也要算起始地址
        else if(low-start<k-1) return findKthLargestHelper(nums,low+1,end,k-(low-start+1));
        else
        {
            return findKthLargestHelper(nums,start,low-1,k);
        }
    }
    //解题思路是使用快速排序进行拆分两个部分然后比较
    public int findKthLargest(int[] nums, int k) {
        return findKthLargestHelper(nums,0,nums.length-1,k);
    }
}
