package cn.edu.hust.array;

public class _122_maxProfit {
    public int maxProfit(int[] prices) {
        int total=0;
        /**
         * 计算最大的利润，也就是计算出后一个比前一个大之和
         */
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i+1]>prices[i])
                total+=prices[i+1]-prices[i];
        }
        return total;
    }
}
