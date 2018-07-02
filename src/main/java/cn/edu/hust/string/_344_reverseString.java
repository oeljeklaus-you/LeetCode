package cn.edu.hust.string;

public class _344_reverseString {
    //从后向前即可
    public String reverseString(String s) {
        if(s==null||s.length()==0) return s;
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
