package cn.edu.hust.string;

public class _58_lengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if(s==null||s.length()==0) return 0;
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            //防止出现"a "的情况
            if(' '==s.charAt(i)&&count==0)
            {
                continue;
            }
            if(' '==s.charAt(i))
            {
                break;
            }
            count++;
        }
        return count;
    }

}
