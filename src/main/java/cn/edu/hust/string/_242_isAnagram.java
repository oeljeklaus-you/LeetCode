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

    //第二种使用素数相乘
    public boolean isAnagram2(String s, String t) {
        int[] bitset = {3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        int f=1;
        //使用素数相乘
        for (int i = 0; i < s.length(); i++) {
            int x=bitset[s.charAt(i)-'a'];
            if(f%x!=0)
            {
                f*=x;
            }
        }
        //如果出现余数肯定不行
        for (int i = 0; i < t.length(); i++) {
            int x=bitset[t.charAt(i)-'a'];
            if(f%x!=0)
            {
                return  false;
            }
        }
        return true;
    }

    //位运算法,使用26位进行移位，然后在相与,只能判断子串
    public boolean isAnagram3(String s, String t) {
        int hash = 1;
        for (int i = 0; i < s.length(); i++) {
            hash |= 1<<(s.charAt(i)-'a');
        }
        for (int i = 0; i < t.length(); i++) {
            if((hash&(1<<(t.charAt(i)-'a')))==0)
            {
                return false;
            }
        }
        return true;
    }

}
