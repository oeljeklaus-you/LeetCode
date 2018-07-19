package cn.edu.hust.string;

import java.util.*;

public class _49_groupAnagrams {

    //第一种方法会超时
    public boolean isAnagram(String s, String t) {
        int[] bitset=new int[26];
        for(int i=0;i<s.length();i++)
        {
            bitset[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            bitset[t.charAt(i)-'a']--;
        }
        for(int i=0;i<bitset.length;i++)
        {
            if(bitset[i]!=0) return false;
        }
        return true;
    }
    public void groupAnagramsHelper(String[] strs,int start,int end,HashMap<String,List<String>> map)
    {

            boolean flag=false;
            if(start>end) return;
            if(start==end)
            {
                Set<String> sets=map.keySet();
                for(String s:sets)
                {
                    if(isAnagram(s,strs[start]))
                    {
                        List<String> list=map.get(s);
                        if(list==null)
                        {
                            list=new ArrayList<String>();
                        }
                        list.add(strs[start]);
                        map.put(s,list);
                        flag=true;
                        break;
                    }
                }
                if(!flag)
                {
                    List<String> list=map.get(strs[start]);
                    list=new ArrayList<String>();
                    list.add(strs[start]);
                    map.put(strs[start],list);
                }
                return ;
            }
        groupAnagramsHelper(strs,start,(start+end)/2,map);
        groupAnagramsHelper(strs,(start+end)/2+1,end,map);

    }


    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<String,List<String>>();
        /*
        boolean flag=false;
        for(int i=0;i<strs.length;i++)
        {
            Set<String> sets=map.keySet();
            for(String s:sets)
            {
                if(isAnagram(s,strs[i]))
                {
                    List<String> list=map.get(s);
                    if(list==null)
                    {
                        list=new ArrayList<String>();
                    }
                    list.add(strs[i]);
                    map.put(s,list);
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                List<String> list=map.get(strs[i]);
                list=new ArrayList<String>();
                list.add(strs[i]);
                map.put(strs[i],list);
            }
            flag=false;
        }*/
        groupAnagramsHelper(strs,0,strs.length-1,map);
        List<List<String>> result=new ArrayList<List<String>>();
        for(List<String> s:map.values())
        {
            result.add(s);
        }
        return result;
    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        int[] bitset = {3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};

        for(int i=0;i<strs.length;i++)
        {
            int key=1;
            for(char c:strs[i].toCharArray())
            {
                key*=bitset[c-'a'];
            }
            if(map.get(Integer.valueOf(key))==null)
            {
                List<String> list=new ArrayList<String>();
                list.add(strs[i]);
                map.put(key,list);
            }
            else
            {
                List<String> list=map.get(key);
                list.add(strs[i]);
                map.put(key,list);
            }
        }
        List<List<String>> result=new ArrayList<List<String>>();
        for(List<String> s:map.values())
        {
            result.add(s);
        }
        return result;

    }

    public static void main(String[] args)
    {
        String[] strs={"tin","ram","zip","cry","pus","jon","zip","pyx"};
        _49_groupAnagrams groupAnagrams=new _49_groupAnagrams();
        List<List<String>> result=groupAnagrams.groupAnagrams2(strs);
        for(List<String> s:result) {
            for (String s1 : s)
            {
                System.out.print(s1+" ");
            }
            System.out.println();
        }
    }
}
