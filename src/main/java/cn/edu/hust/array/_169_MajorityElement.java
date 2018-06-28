package cn.edu.hust.array;

public class _169_MajorityElement {
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
