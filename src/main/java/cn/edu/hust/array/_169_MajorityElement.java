package cn.edu.hust.array;

public class _169_MajorityElement {
    /**
     * 这里根据众数的特点，使用两个变量，一个是计数，一个是结果，如果是0那么就计数，如果不是则--，是那么就++
     * @param nums
     * @return
     */
    // 利用众数的性质
    public int majorityElement(int[] nums) {

        int count=0;
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                result=nums[i];
                count=1;
            }
            else
            {
                if(result!=nums[i])
                {
                    count--;
                }
                else
                {
                    count++;
                }
            }
        }
        return result;
    }
}
