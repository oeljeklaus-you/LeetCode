package cn.edu.hust.array;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class _349_intersection {
    //解法一:通过给两个数组排序然后求解,时间复杂度是O(nLogN),空间复杂度为O(n)
    public int[] intersection1(int[] nums1, int[] nums2) {
        if(nums1==null||nums2==null) return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1=nums1.length;
        int len2=nums2.length;
        Set<Integer> result=new HashSet<Integer>();
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

    //解法二:通过暴力解法时间复杂度为O(n^2),空间复杂度为O(n)
    public int[] intersection2(int[] nums1, int[] nums2) {
        if(nums1==null||nums2==null) return new int[0];
        Set<Integer> result=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    result.add(nums1[i]);
                    break;
                }
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

    //解法三:通过HashMap求解,时间复杂度为O(n),空间复杂度为O(n)
    public int[] intersection3(int[] nums1, int[] nums2) {
        if(nums1==null||nums2==null) return new int[0];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++) {
            if(map.get(nums1[i])==null)
            {
                map.put(nums1[i],1);
            }
        }
        Set<Integer> result=new HashSet<Integer>();
        for(int i=0;i<nums2.length;i++)
        {
            if(map.get(nums2[i])!=null)
            {
                result.add(nums2[i]);
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

    //解法四:与解法一无异
    public int[] intersection4(int[] nums1, int[] nums2)
    {
        int sizeArrayA=nums1.length;
        int sizeArrayB=nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Queue<Integer> queueA=new ArrayBlockingQueue<Integer>(sizeArrayA);
        Queue<Integer> queueB=new ArrayBlockingQueue<Integer>(sizeArrayB);
        for(int i=0;i<sizeArrayA;i++){
            queueA.add(nums1[i]);
        }
        for(int i=0;i<sizeArrayB;i++){
            queueB.add(nums2[i]);
        }
        Set<Integer> intersectionSet = new HashSet<Integer>();

        while (!queueA.isEmpty()){
            Integer valueA=queueA.peek();
            Integer valueB=queueB.peek();
            if(null==valueA||null==valueB){
                break;
            }
            if(valueA.equals(valueB)){
                intersectionSet.add(valueA);
                queueA.poll();
                queueB.poll();
            }
            else if(valueA>valueB){
                queueB.poll();
            }
            else if(valueA<valueB){
                queueA.poll();
            }
        }
        int result2[]=new int[intersectionSet.size()];
        int i=0;
        for(Integer t:intersectionSet)
        {
            result2[i]=t;
            i++;
        }
        return result2;
    }
}
