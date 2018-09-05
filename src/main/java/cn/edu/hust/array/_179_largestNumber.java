package cn.edu.hust.array;

import java.util.Arrays;

public class _179_largestNumber {

    public String largestNumber(int[] nums) {
        if(nums==null||nums.length==0) return "";
        for(int i=1;i<nums.length;i++)
        {
            int j=i;
            while(j>0&&isBiger(nums[j],nums[j-1]))
            {
                int tmp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=tmp;
                j--;
            }
        }
        StringBuilder result=new StringBuilder();
        int count=0;
        for(int i:nums)
        {
            result.append(i);
            if(count==0) count++;
        }
        if(count==result.toString().length()) return "0";
        return result.toString();
    }

    // 这里的更大是比较的字典序列
    private boolean isBiger(int num, int num1) {
        String a=String.valueOf(num);
        String b=String.valueOf(num1);
        if((a+b).compareTo(b+a)>0)
        {
            return true;
        }
        return false;
    }
}
