package cn.edu.hust.array;

import java.util.ArrayList;
import java.util.List;

public class _448_findDisappearedNumbers {
    //思路就是 将数放在合适的位置即可
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[nums[i]-1]!=nums[i])
            {
                int tmp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=tmp;
                i--;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
                result.add(i+1);
        }
        return result;
    }
}
