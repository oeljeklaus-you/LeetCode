package cn.edu.hust.math;

public class _260_singleNumber {
    //题136的加强版
    public int[] singleNumber(int[] nums) {
        int result=nums[0];
        //得到遗祸值
        for(int i=1;i<nums.length;i++)
        {
            result^=nums[i];
        }
        int index=0;
        //得到第一个1的位置
        while((result&1)==0)
        {
            index++;
            result=result>>1;
        }
        int[] resultL=new int[2];
        //按照第一个1的位置划分数组
        for(int i=0;i<nums.length;i++)
        {
            if(((nums[i]>>index)&1)==0)
            {
                resultL[0]^=nums[i];
            }
            else
            {
                resultL[1]^=nums[i];
            }
        }
        return resultL;
    }
}
