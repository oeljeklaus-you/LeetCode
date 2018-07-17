package cn.edu.hust.array;

public class _268_missingNumber {
    //解题思路是，如果现在的值小于i或者后者大于等于数组长度舍弃，如果不等于，就将该值放在合适的位置，最后就是i++
    public int missingNumber(int[] nums) {
        int i=0;
        int tmp;
        int len=nums.length;
        //下标是值
        while(i<len)
        {
            //如果现在的值小于i，或者大于数组长度则抛弃
            if(nums[i]<i||nums[i]>=len)
            {
                nums[i]=nums[len-1];
                len--;

            }else if(nums[i]!=i)
            {
                //如果这个数不在具体的位置，那么将这个数与对应的位置值交换
                tmp=nums[nums[i]];
                nums[nums[i]]=nums[i];
                nums[i]=tmp;
            }else
            {
                i++;
            }
        }
        return i;
    }
}
