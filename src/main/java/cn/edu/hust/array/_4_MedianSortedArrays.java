package cn.edu.hust.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4_MedianSortedArrays {

    //解法一，耗时O(NlogN)
    public static double soultion1(int[] nums1, int[] nums2)
    {
        List<Integer> list=new ArrayList<Integer>();
        for(int i:nums1)
        {
            list.add(i);
        }
        for(int i:nums2)
        {
            list.add(i);
        }
        Integer[] t=list.toArray(new Integer[0]);
        Arrays.sort(t);
        if((t.length&1)!=0) return (double)t[t.length/2];
        else
        {
            int j=t[t.length/2-1]+t[t.length/2];
            return j/(2.0);
        }

    }


    //解法二，利用排序数组的性质，结合归并排序
    public static double soultion2(int[] nums1, int[] nums2)
    {
       return 0;

    }

}
