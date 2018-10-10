package cn.edu.hust.array;

public class _26_RemoveDuplicates {

    //时间复杂度O(n^2)这里要注意数组移除后的长度和移除后需要重新判断，需要i--重新判断
    public int removeDuplicates(int[] nums) {
        int size=nums.length;
        for(int i=0;i<size-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                for(int j=i;j<size-1;j++)
                {
                    nums[j]=nums[j+1];
                }
                size=size-1;
                i--;
            }
        }
        return size;
    }

    //这里使用快慢指针法
    public int removeDuplicates2(int[] nums) {
        /**
         * 移除元素，指向重复元素的第一个，那么当后来有元素不同的时候就删除
         */
        if(nums.length==0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            //如果相同的时候，那么就直接跳过，如果不同，那就将不同的复制给相同的
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

}
