package cn.edu.hust.backtrack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _47_permuteUnique {
    public void swap(int[] nums,int start,int i)
    {
        int tmp=nums[start];
        nums[start]=nums[i];
        nums[i]=tmp;
    }

    //固定一个位置然后计算,巧用数据结构
    public void getPermute(int[] nums,int start,int end,Set<List<Integer>> resultList)
    {
        if(start==end)
        {
            List<Integer> result=new ArrayList<Integer>();
            for(int i=0;i<=end;i++)
            {
                result.add(nums[i]);
            }
            resultList.add(result);
        }
        else
        {
            for(int i=start;i<=end;i++)
            {
                swap(nums,start,i);
                getPermute(nums,start+1,end,resultList);
                swap(nums,start,i);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> resultList=new HashSet<List<Integer>>();
        if(nums==null) return new ArrayList<List<Integer>>();
        getPermute(nums,0,nums.length-1,resultList);
        List<List<Integer>> result=new ArrayList<List<Integer>>(resultList);
        return result;
    }
}
