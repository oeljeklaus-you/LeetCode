package cn.edu.hust.array;

import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {
    //时间复杂度为O(n),空间复杂度是O(n)
    public static int[] solution1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int count = target - nums[i];
            Integer t = map.get(count);
            if (t != null && t != i) {
                result[0] = i;
                result[1] = t;
                return result;
            }
        }
        return result;
    }

    //解法二，时间复杂度为O(n^2),空间复杂度是O(1)
    public static int[] solution2(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int count = target - nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==count){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
}