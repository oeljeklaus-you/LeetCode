package cn.edu.hust.string;

public class _242_isAnagram {
    //解题思路:由于全是小写，可以使用HashMap进行映射，然后判断即可
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
}
