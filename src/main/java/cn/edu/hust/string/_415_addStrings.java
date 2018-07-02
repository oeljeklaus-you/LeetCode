package cn.edu.hust.string;

public class _415_addStrings {
    //翻转相加即可
    public String addStrings(String num1, String num2) {
        if(num1.length()==0) return num2;
        else if(num2.length()==0) return num1;
        String s1=new StringBuilder(num1).reverse().toString();
        String s2=new StringBuilder(num2).reverse().toString();
        StringBuilder result=new StringBuilder();
        int i=0,count=0;
        int max_length=s1.length()>s2.length()?s1.length():s2.length();
        while(i<max_length)
        {
            char a=i>=s1.length()?'0':s1.charAt(i);
            char b=i>=s2.length()?'0':s2.charAt(i);
            int sum=a-'0'+b-'0'+count;
            count=sum/10;
            char c=(char)(sum%10+48);
            result.append(c);
            i++;
        }
        if(count!=0)  result.append((char)(count+48));

        return result.reverse().toString();
    }
}
