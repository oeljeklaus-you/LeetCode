package cn.edu.hust.array;

public class _283_moveZeroes {
    /**
     * 双指针法:使用一个指针指向0的位置，然后遍历数组，如果遍历的元素不等于0那就复制，然后将后面的元素复制为0
     * @param nums
     */
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
