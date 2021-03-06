package cn.edu.hust.array;

import java.util.*;

public class _239_maxSlidingWindow {
    public int getMax(Deque<Integer> queue)
    {
        int max=queue.peek();
        Iterator<Integer> it=queue.iterator();
        while(it.hasNext())
        {
            int tmp=it.next();
            if(tmp>max)
                max=tmp;
        }
        return max;
    }

    /**
     * 滑动窗口的最大值:使用一个双端队列，如果某个双端队列找到最大值，然后进行计算即可
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||nums.length==0) return new int[0];
        Deque<Integer> queue=new ArrayDeque<Integer>();
        List<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(queue.size()<k) queue.add(nums[i]);
            else
            {
                result.add(getMax(queue));
                queue.removeFirst();
                queue.add(nums[i]);
            }
        }
        result.add(getMax(queue));
        int result2[]=new int[result.size()];
        for(int i=0;i<result.size();i++)
        {
            result2[i]=result.get(i);
        }
        return result2;
    }
}
