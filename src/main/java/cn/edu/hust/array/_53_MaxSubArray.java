package cn.edu.hust.array;

public class _53_MaxSubArray {
    //动态规划问题，主要是找出初状态和转化方程
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int result[] = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + result[i - 1] >= nums[i]) {
                result[i] = nums[i] + result[i - 1];
            } else {
                result[i] = nums[i];
            }
        }
        int tmp = result[0];
        for (int i = 1; i < result.length; i++) {
            if (result[i] > tmp) {
                tmp = result[i];
            }
        }
        return tmp;
    }
}
