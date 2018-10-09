package cn.edu.hust.array;

public class _55_canJump {
    //可以这样想一下：用一个变量表示当一次走到这里后当前可走的路，每次都走一步，这里需要与当前可以走的步数，
    //比较两个量，取较大的，为什么呢，因为较小的值能走的，较大的一定能走，什么情况下不能走了呢？
    //走到这一步剩余0，那么就不能走了，
    public boolean canJump(int[] nums) {
        if(nums==null||nums.length==0) return false;
        int step=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(step>0)
            {
                step--;
                step=Math.max(step,nums[i]);
            }
            else
                return false;

        }
        return true;
    }
}
