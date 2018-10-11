package cn.edu.hust.array;

public class _153_findMin {
    /**
     * 查找有序数组中的最小值，这个解题思路是怎么样的呢？
     * 1。首先使用二分来进行排除
     * 1。1这里需要注意的是如果只有一个元素，那么将会直接返回第一个
     * 1。2如果数组是有序的或者只有两个元素那么直接返回
     * 1。3如果前排的序列是有序的那么low=mid+1
     * 1。4如果后排是有序的那么high=mid [2,0,1]
     * 1.5还有一种是逆序或者是[1,1,1,1,1,0,1,1,1,1,1]这种情况
     * @param nums
     * @return
     */
    //解题思路使用二分法
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high)
        {
            //这里注意要使用这个判断，第一个是判断1，2，3情况，第二个是2，1这种情况
            if(nums[low]<nums[high]||high-low==1)
            {
                return nums[low]<nums[high]?nums[low]:nums[high];
            }
            int mid=(low+high)/2;
            //如果中间大于前面，那么将在下一段
            if(nums[mid]>nums[low])
            {

                low=mid+1;
                //如果中间值小于最后的值，那么将在前一段，这里有可能会有[2,0,1]这种情况
            }else if(nums[mid]<nums[high])
            {
                high=mid;
            }
            else
            {
                //假设是逆序这种情况
                low++;
            }
        }
        return nums[low];
    }
}
