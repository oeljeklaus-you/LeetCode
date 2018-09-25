package cn.edu.hust.hw;

public class HeapSort {
    public boolean isLeaf(int length,int pos)
    {
        return pos>length/2-1;
    }

    public void siftdown(int nums[],int length,int pos)
    {
        while(!isLeaf(length,pos))
        {
            int left=2*pos+1,right=2*pos+2;
            if(right<length)
                left=nums[left]>nums[right]?right:left;
            //需要删除
            if(nums[left]>nums[pos]) return ;
            swap(nums,pos,left);
            pos=left;
        }
    }

    private void swap(int[] nums, int pos, int left) {
        int tmp=nums[pos];
        nums[pos]=nums[left];
        nums[left]=tmp;
    }

    public void buildHeap(int nums[],int length)
    {
        for(int i=length/2-1;i>=0;i--)
        {
            siftdown(nums,length,i);
        }
    }

    public void sort(int nums[])
    {
        for(int i=nums.length;i>0;i--)
        {
            buildHeap(nums,i);
            swap(nums,0,i-1);
            System.out.print(nums[i-1]+" ");
        }
    }

    public static void main(String[] args)
    {
        HeapSort heapSort=new HeapSort();
        int nums[]={0,2,1,89,3,56,8,10,34,78};
        heapSort.sort(nums);
    }
}
