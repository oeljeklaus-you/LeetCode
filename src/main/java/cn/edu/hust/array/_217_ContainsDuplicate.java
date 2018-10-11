package cn.edu.hust.array;

import java.util.HashMap;
import java.util.Map;

public class _217_ContainsDuplicate {
    /**
     *  使用hashmap来进行遍历
     * @param nums
     * @return
     */
    //利用HashMap的性质即可，也可以排序后在判断
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> maps=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(maps.get(nums[i])==null)
            {
                maps.put(nums[i],1);
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
