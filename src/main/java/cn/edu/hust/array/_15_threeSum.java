package cn.edu.hust.array;

import java.util.*;

public class _15_threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        /**
         * 主要的解法如下：
         * 1。首先固定一端，然后计算移动两端的指针，需要注意的是移动的时候需要加入hashset
         * 2。然后移动固定的一端，最后的一端每次都会变得和前一次循环一样即可
         */
        Set<List<Integer>> res  = new HashSet<List<Integer>>();
        if(nums.length==0) return new ArrayList<List<Integer>>(res);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
            int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if ( sum >0) k--;
                else if (sum<0) j++;
            }

        }
        return new ArrayList<List<Integer>>(res);
    }
}
