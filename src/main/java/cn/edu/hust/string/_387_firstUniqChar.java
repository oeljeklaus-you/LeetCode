package cn.edu.hust.string;

public class _387_firstUniqChar {
    //使用hash的方式将字符映射都hash表中，然后再次扫描
    public int firstUniqChar(String s) {
        if(s==null||"".equals(s)) return -1;
        int[] hash=new int[26];
        for(char c:s.toCharArray())
        {
            hash[c-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(hash[s.charAt(i)-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
}
