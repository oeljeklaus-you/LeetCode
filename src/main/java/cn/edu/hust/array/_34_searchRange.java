package cn.edu.hust.array;

public class _34_searchRange {
    /**
     * 怎么求一个目标值的最小值呢
     * 1。首先使用二分法求解，这里需要说明的是需要在获得一个位置后继续计算
     * 2。怎么计算呢？求解最小值，那么就将high的值移动到刚才找到的最后的值的前一个即可
     * @param nums
     * @param target
     * @return
     */
    public int getMinIndex(int[] nums,int target)
    {
        if(nums==null) return -1;
        int index=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                index=mid;
                high=mid-1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return index;
    }

    /**
     * 怎么求一个目标值的最小值呢
     * 1。首先使用二分法求解，这里需要说明的是需要在获得一个位置后继续计算
     * 2。怎么计算呢？求解最小值，那么就将high的值移动到刚才找到的最后的值的前一个即可
     * @param nums
     * @param target
     * @return
     */
    public int getMaxIndex(int[] nums,int target)
    {
        if(nums==null) return -1;
        int index=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                index=mid;
                low=mid+1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] indexs=new int[2];
        indexs[0]=getMinIndex(nums,target);
        indexs[1]=getMaxIndex(nums,target);
        return indexs;
    }
}
