package cn.edu.hust.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _219_ContainsNearbyDuplicate {
    //解题和重复的数I相同只是数据结构不同，时间复杂度为O(n)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,List<Integer>> maps=new HashMap<Integer,List<Integer>>();
        for(int i=0;i<nums.length;i++)
        {
            if(maps.get(nums[i])==null)
            {
                List<Integer> tmp=new ArrayList<Integer>();
                tmp.add(i);
                maps.put(nums[i],tmp);
            }
            else
            {
                List<Integer> tmp=maps.get(nums[i]);
                for(int j=0;j<tmp.size();j++)
                {
                    if(i-tmp.get(j)<=k) return true;
                }
                tmp.add(i);
            }
        }
        return false;
    }
}
