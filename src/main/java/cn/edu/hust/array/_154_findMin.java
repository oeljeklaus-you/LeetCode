package cn.edu.hust.array;

public class _154_findMin {
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
                low=mid;
                //如果中间值小于最后的值，那么将在前一段
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
