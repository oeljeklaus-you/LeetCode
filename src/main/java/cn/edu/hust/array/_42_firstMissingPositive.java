package cn.edu.hust.array;

public class _42_firstMissingPositive {
    //这里在题268增加了一个判断，就是如果又重复的数就舍弃
    public int firstMissingPositive(int[] nums) {
        int size=nums.length-1;
        int i=0;
        int tmp;
        while(i<size)
        {
            if(nums[i]==i+1)
            {
                i++;
            }else if((nums[i]<i+1||nums[i]>nums.length)||nums[nums[i]-1]==nums[i])
            {
                nums[i]=nums[size--];
            }
            else
            {
                tmp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=tmp;
            }
        }
        return i;
    }
    public static void main(String[] args)
    {
        int nums[]={2,2};
        _42_firstMissingPositive firstMissingPositive=new _42_firstMissingPositive();
        firstMissingPositive.firstMissingPositive(nums);
    }
}
