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
