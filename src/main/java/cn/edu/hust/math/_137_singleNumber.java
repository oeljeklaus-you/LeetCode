package cn.edu.hust.math;

import java.util.HashMap;
import java.util.Map;

public class _137_singleNumber {

    //第一种解法，使用HashMap，时间复杂度是O(n),空间复杂度是O(n)
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
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
        for(Map.Entry<Integer,Integer> t:map.entrySet())
        {
            if(t.getValue()==1){
                return t.getKey();
            }
        }
        return 0;
    }


}
