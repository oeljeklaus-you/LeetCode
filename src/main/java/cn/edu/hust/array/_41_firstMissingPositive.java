package cn.edu.hust.array;

public class _41_firstMissingPositive {
    //这里在题268增加了一个判断，就是如果又重复的数就舍弃

    /**
     * 具体的思路如下:
     * 将各个元素按照各个位置放置
     * 1。如果放置的位置正确，那么就继续遍历
     * 2。如果该位置的值大于数组长度或者是放置后的值和放置的数相同或者是放置后值小于值那就舍弃
     * @param nums
     * @return
     */
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
        _41_firstMissingPositive firstMissingPositive=new _41_firstMissingPositive();
        firstMissingPositive.firstMissingPositive(nums);
    }
}
