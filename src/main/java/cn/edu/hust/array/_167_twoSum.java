package cn.edu.hust.array;

public class _167_twoSum {
    /**
     * 使用双指针法即可
     * @param numbers
     * @param target
     * @return
     */
    //利用有序性特点即可
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int low=0;
        int high=numbers.length-1;
        while(low<high)
        {
            while(low<high&&numbers[low]+numbers[high]<target) low++;
            while(low<high&&numbers[low]+numbers[high]>target) high--;
            if(numbers[low]+numbers[high]==target)
            {
                result[0]=low+1;
                result[1]=high+1;
                break;
            }

        }
        return result;
    }
}
