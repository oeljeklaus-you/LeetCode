package cn.edu.hust.array;

public class _88_merge {
    // 从后向前归并即可
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n-1;
        int i=m-1;
        int j=n-1;
        //需要判断i，j从后向前归并即可
        while(i>=0&&j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
        //判断j是否大于等于0
        while(j>=0) nums1[k--]=nums2[j--];

    }

}
