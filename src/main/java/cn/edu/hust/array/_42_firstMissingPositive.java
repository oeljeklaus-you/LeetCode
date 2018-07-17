package cn.edu.hust.array;

public class _42_firstMissingPositive {
    //这里只能是没有重复元素否则就会出错
    public int firstMissingPositive(int[] nums) {
        int size=nums.length;
        int i=1;
        int tmp;
        while(i<=size)
        {
            //假设在i-1已经排序好
            if(nums[i-1]<i||nums[i-1]>size)
            {
                //如果出现这个，则直接丢弃,丢弃策略是将最后的元素复制到最后这个位置，然后长度减1
                nums[i-1]=nums[size-1];
                size--;
            }else if(nums[i-1]>i)
            {
                //如果出现的数组大于位置i，并且小于长度size则交换
                tmp= nums[nums[i-1]-1];
                nums[nums[i-1]-1]=nums[i-1];
                nums[i-1]=tmp;
            }
            else
            {   //如果位置放置好就直接加1
                i++;
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
