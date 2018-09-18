package cn.edu.hust.string;

public class _3_lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0) return 0;
        StringBuilder sb=new StringBuilder();
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            if(sb.indexOf(s.charAt(i)+"")==-1)
            {
                sb.append(s.charAt(i));
                if(sb.length()>result) result=sb.length();
            }
            else
            {
                int j=sb.indexOf(s.charAt(i)+"");
                sb=new StringBuilder(sb.toString().substring(j+1));
                i--;
            }
        }
        if(sb.length()>result) result=sb.length();
        return result;
    }

    public static void main(String[] args)
    {
        _3_lengthOfLongestSubstring  lengthOfLongestSubstring=new _3_lengthOfLongestSubstring();
        lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb");
    }
}
