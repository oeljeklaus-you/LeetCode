package cn.edu.hust.array;

import java.util.Iterator;
import java.util.TreeSet;

public class _414_thirdMax {
    //解法一，当然是用一个TreeSet，时间复杂度和空间复杂度都是O(n)
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set=new TreeSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        if(set.size()<3) return set.last();
        Iterator<Integer> it=set.iterator();
        int i=0;
        while(it.hasNext())
        {
            if(i==set.size()-3)
            {
                return it.next();
            }
            it.next();
            i++;
        }
        return 0;
    }


    //解法2，使用3个变量即可
    public int thirdMax2(int[] nums) {
       Integer max1=null,max2=null,max3=null;
       for(Integer num:nums)
       {
           if(max1==num||max2==num||max3==num) continue;
           if(max1==null||num>max1)
           {
               max3=max2;
               max2=max1;
               max1=num;
           }else if(max2==null||num>max2)
           {
               max2=max2;
               max2=num;
           }else if(max3==null||num>max3)
           {
               max3=num;
           }
       }
       return max3==null?max1:max3;
    }
}
