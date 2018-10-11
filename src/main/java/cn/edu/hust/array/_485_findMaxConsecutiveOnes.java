package cn.edu.hust.array;

public class _485_findMaxConsecutiveOnes {
    //两个指针即可

    /**
     * 使用两个东西来进行计数
     * 如果出现了0，那么就重新计数即可
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                if(count1<count2)
                {
                    count1=count2;
                }
                count2=0;
            }
            else
            {
                count2++;
            }
        }
        if(count1<count2) count1=count2;
        return count1;
    }
}
