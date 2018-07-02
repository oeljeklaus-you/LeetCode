package cn.edu.hust.string;

public class _67_addBinary {
    // StringBuiler中又一个函数用于反转
    public String addBinary(String a, String b) {
        int len1=a.length()-1;
        int len2=b.length()-1;
        StringBuilder sb=new StringBuilder();
        char c1='0';
        char c2='0';
        int count=0;
        while(len1>=0||len2>=0)
        {
            if(len1>=0)
                c1=a.charAt(len1);
            else c1='0';
            if(len2>=0)
                c2=b.charAt(len2);
            else c2='0';
            int tmp=c1-'0'+c2-'0'+count;
            count=tmp/2;
            sb.append(tmp%2);
            len1--;
            len2--;
        }
        if(count!=0) sb.append(count);
        return sb.reverse().toString();
    }
}
