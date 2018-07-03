package cn.edu.hust.array;

public class _283_moveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[j++] = nums[i];
        }
        for (; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
