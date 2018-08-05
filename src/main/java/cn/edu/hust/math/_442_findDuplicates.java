package cn.edu.hust.math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _442_findDuplicates {
    //解法一，通过hashMap空间复杂度是O(n)
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==null)
            {
                map.put(nums[i],1);
            }
            else
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        List<Integer> result=new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==2)
            {
                result.add(entry.getKey());
            }
        }
        return result;
    }
    //解法二，可以给的数据进行判断解法
    public List<Integer> findDuplicates2(int[] nums) {
        List<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            //这是结合题目意思进行下标定位
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0)
            {
                //添加重复的元素
                result.add(index+1);
            }
            //反转数字
            nums[index]=-nums[index];
        }
        return result;
    }
}
