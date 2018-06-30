package cn.edu.hust.string;

public class _14_longestCommonPrefix {
    //递归即可，需要注意的是Java中去在对应位置的下标用的是charAt方法
    public String getTwoStrCommonPrefix(String a,String b)
    {
        if(a.length()==0|| b.length()==0) return "";
        int len=a.length()>b.length()?b.length():a.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++)
        {
            if(((a.charAt(i))^(b.charAt(i)))==0)
            {
                sb.append(a.charAt(i));
            }
            else
                break;//这里注意是前缀没有就跳出

        }
        return sb.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            result = getTwoStrCommonPrefix(result, strs[i]);
        }
        return result;
    }
}
