package cn.edu.hust.string;

public class _7_reverse {
    public int reverse(int x) {
        StringBuilder sb=new StringBuilder();
        boolean flag=false;
        if(x<0)
        {
            flag=true;
            x=Math.abs(x);
        }
        sb.append(x);
        String tmp=sb.reverse().toString();
        long result=0;
        for(int i=0;i<tmp.length();i++)
        {
            if(flag)
            {
                result= result*10-(tmp.charAt(i)-'0');
            }
            else
                result=result*10+tmp.charAt(i)-'0';
            if(result<-Math.pow(2,31)||result>Math.pow(2,31)-1)
                return 0;
        }
        return (int)result;
    }
}
