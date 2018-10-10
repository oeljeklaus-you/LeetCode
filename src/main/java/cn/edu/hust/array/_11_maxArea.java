package cn.edu.hust.array;

public class _11_maxArea {
    //解题思路:暴力破解
    public int maxArea(int[] height) {
        int result=0;
        if(height==null||height.length==0) return result;
        for(int i=0;i<height.length;i++)
        {
            for(int j=i+1;j<height.length;j++)
            {
                int tmp=(j-i)*(height[j]>height[i]?height[i]:height[j]);
                if(tmp>result)
                    result=tmp;
            }
        }
        return result;
    }

    //可以使用双指针法:只需要每一次移动较小的指针即可
    public int maxArea2(int[] height) {
        /**
         * 要首先明白盛水容器的省水量是底*高，底一定时，高最小的才是计算所需要的
         * 我们可以这样解决:
         * 1.使用双指针，首先计算一个面积
         * 2.计算出来后，移动较小的那一端，为啥移动较小的那一端呢？因为较小的决定了面积，只有较小的才好一点
         */
        int result=0;
        if(height==null||height.length==0) return result;
        int left=0;
        int right=height.length-1;
        while(left<right)
        {
            if(height[left]<height[right])
            {
                int t=(right-left)*height[left];
                if(t>result) result=t;
                left++;
            }
            else
            {
                int t=(right-left)*height[right];
                if(t>result) result=t;
                right--;
            }
        }
        return result;
    }
}
