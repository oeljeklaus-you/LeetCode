package cn.edu.hust.array;

public class _121_maxProfit {
    //第一种解决方案:当然是直接解决时间复杂度是O()n^2
    public int maxProfit(int[] prices) {
        int result=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]-prices[i]>result)
                    result=prices[j]-prices[i];
            }
        }
        return result;
    }

    //可以使用两个变量保存路上的最小值，然后计算最大的利润
    public int maxProfit2(int[] prices) {
        int result=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
                min=prices[i];
            else if(prices[i]-min>result)
                result=prices[i]-min;
        }
        return result;
    }
}
