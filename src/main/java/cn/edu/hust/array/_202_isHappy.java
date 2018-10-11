package cn.edu.hust.array;

public class _202_isHappy {
    /**
     * 根据快乐数的定义进行递归遍历判断
     * @param n
     * @return
     */
    //递归即可不过注意4会引起死循环
    public boolean isHappy(int n) {
        if(n==1) return true;
        else if(n<=4&&n!=1) return false;
        int result=0;
        while(n!=0)
        {
            result+=(n%10)*(n%10);
            n=n/10;
        }
        return isHappy(result);
    }
}
