package cn.edu.hust.backtrack;

import java.util.ArrayList;
import java.util.List;

public class _46_permute {
    public void swap(int[] nums,int start,int i)
    {
        int tmp=nums[start];
        nums[start]=nums[i];
        nums[i]=tmp;
    }

    //固定一个位置然后计算
    public void getPermute(int[] nums,int start,int end,List<List<Integer>> resultList)
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
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList=new ArrayList<List<Integer>>();
        if(nums==null) return resultList;
        getPermute(nums,0,nums.length-1,resultList);
        return resultList;
    }
}
