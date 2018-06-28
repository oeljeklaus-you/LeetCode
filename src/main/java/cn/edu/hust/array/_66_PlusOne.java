package cn.edu.hust.array;

public class _66_PlusOne {
    //时间复杂度O(n),从后往前加1，然后判断
    public int[] plusOne(int[] digits) {
        int count=1;
        for(int i=digits.length-1;i>=0;i--)
        {
            int tmp=digits[i]+count;
            digits[i]=(tmp)%10;
            count=tmp/10;
        }
        int[] result;
        if(count!=0)
        {
            result=new int[digits.length+1];
            result[0]=count;
        }else
        {
            return digits;
        }
        for(int i=0;i<digits.length;i++)
        {
            result[i+1]=digits[i];
        }
        return result;
    }
}
