package cn.edu.hust.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _350_intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1==null||nums2==null) return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1=nums1.length;
        int len2=nums2.length;
        List<Integer> result=new ArrayList<Integer>();
        while(len1>0&&len2>0)
        {
            if(nums1[len1-1]>nums2[len2-1])
            {
                len1--;
            }else if(nums1[len1-1]<nums2[len2-1])
            {
                len2--;
            }else
            {
                result.add(nums1[len1-1]);
                len1--;
                len2--;
            }
        }
        int result2[]=new int[result.size()];
        int i=0;
        for(Integer t:result)
        {
            result2[i]=t;
            i++;
        }
        return result2;
    }
}
