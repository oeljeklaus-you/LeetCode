package cn.edu.hust.array;

public class _189_rotate {
    //第一种解法，时间复杂度为O(kn),空间复杂度是O(1)
    public void rotate1(int[] nums, int k) {
        if(nums==null||nums.length<=1) return;
        k=k%nums.length;
        int tmp=0;
        int i=0;
        while(i<k)
        {
            tmp=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--)
            {
                nums[j]=nums[j-1];
            }
            nums[0]=tmp;
            i++;
        }

    }

    /**
     * 对于翻转的题目一般是全部翻转，然后局部翻转
     * @param nums
     * @param start
     * @param end
     */
    private void rotateHelper(int[] nums,int start,int end) {
        if(start>=end) return;
        int tmp;
        while(start<end) {
            tmp=nums[start];
            nums[start]=nums[end];
            nums[end]=tmp;
            start--;
            end++;
        }
    }
    //第二后解法:一般旋转问题的解法，时间复杂度是O(n),空间复杂度是O(1)
    public void rotate2(int[] nums, int k) {
        if(nums==null||nums.length<=1) return;
        k=k%nums.length;
        //先将数组整体翻转
        rotateHelper(nums,0,nums.length-1);
        //部分翻转
        rotateHelper(nums,0,k-1);
        rotateHelper(nums,k,nums.length-1);
    }


}