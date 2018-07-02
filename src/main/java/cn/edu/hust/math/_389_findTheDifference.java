package cn.edu.hust.math;

public class _389_findTheDifference {
    public char findTheDifference(String s, String t) {
        //异或即可
        if("".equals(s)) return t.charAt(0);
        char c=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            c^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++)
        {
            c^=t.charAt(i);
        }
        return (char)c;
    }

}
