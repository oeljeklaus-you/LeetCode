package cn.edu.hust.sort;

public class Sort {


    //插入排序是一种稳定的排序方法,最好的时间复杂是O(n)也就是已经排好的序列,最差的时间复杂度是O(n^2)逆序
    public void insertSort(int nums[])
    {
        int tmp;
        for(int i=1;i<nums.length;i++)
        {
            int j=i;
            while(j>0&&nums[j]<nums[j-1])
            {
                tmp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=tmp;
                j--;
            }
        }
    }

    //选择排序是一种不稳定的排序方法，最好最坏的时间复杂度都是O(n^2)
    public void selectSort(int nums[])
    {
        int tmp;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]<nums[i])
                {
                    tmp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=tmp;
                }
            }
        }
    }

    //冒泡排序 一种稳定的排序算法，最好最坏的时间复杂度都是O(n^2)
    public void  bubbleSort(int nums[])
    {
        int tmp;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    tmp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                }
            }
        }
    }



    //快速排序是由一种不稳定的排序算法，最好的时间复杂度是O(nLogN)，最差时间复杂度是O(n^2)
    private void quickSortHelper(int nums[],int start,int end)
    {
        if(start>=end) return;
        int low=start;
        int high=end;
        int target=nums[low];
        while(low<high)
        {
            while(low<high&&nums[high]>=target)
            {
                high--;
            }
            nums[low]=nums[high];
            while(low<high&&nums[low]<=target)
            {
                low++;
            }
            nums[high]=nums[low];
        }
        nums[low]=target;
        quickSortHelper(nums,start,low-1);
        quickSortHelper(nums,low+1,end);
    }

    public void quickSort(int nums[])
    {
        quickSortHelper(nums,0,nums.length-1);
    }


    //归并排序,是一种不稳定的排序是算法这个算法的时间复复杂度都是O(NlogN)
    public void megerSort(int nums[],int[] tmp,int start,int end)
    {
         if(start==end) return ;
         int mid=(start+end)/2;
         megerSort(nums,tmp,start,mid);
         megerSort(nums,tmp,mid+1,end);
         for(int i=start;i<=end;i++)
         {
             tmp[i]=nums[i];
         }
         int i=start,j=mid+1;
        for(int k=start;k<=end;k++)
        {
            if(i==mid+1)
            {
                nums[k]=tmp[j++];
            }else if(j==end+1)
            {
                nums[k]=tmp[i++];
            }else if(tmp[i]>tmp[j])
            {
                nums[k]=tmp[j++];
            }
            else
            {
                nums[k]=tmp[i++];
            }
        }
    }

    //希尔排序是一个不稳定的排序算法
    public void shellSortHelper(int[] nums,int incr)
    {
        int tmp;
        for(int i=incr;i<nums.length;i+=incr)
        {
            int j=i;
            while(j-incr>0&&nums[j]<nums[j-incr])
            {
                tmp=nums[j];
                nums[j]=nums[j-incr];
                nums[j-incr]=tmp;
                j-=incr;
            }
        }
    }
    //希尔排序
    public void shellSort(int[] nums)
    {
        for(int i=nums.length/2;i>0;i/=2)
        {
            shellSortHelper(nums,i);
        }
    }

    //堆排序
    private boolean isLeaf(int nums[],int pos)
    {
        //没有叶子节点
        return pos*2+1>=nums.length;
    }

    private void swap(int[] nums,int pos1,int pos2)
    {
        int tmp;
        tmp=nums[pos2];
        nums[pos2]=nums[pos1];
        nums[pos1]=tmp;
    }

    private void shiftdown(int[] nums,int pos)
    {
        while(!isLeaf(nums,pos))
        {
            int left=pos*2+1;
            int right=pos*2+2;
            if(right<nums.length)
            {
                left=nums[left]>nums[right]?left:right;
            }
            //是否需要调整堆
            if(nums[pos]>=nums[left]) return;
            swap(nums,pos,left);
            pos=left;
        }
    }
    public void buildHeap(int nums[])
    {
        for(int i=nums.length/2-1;i>=0;i--)
        {
            shiftdown(nums,i);
        }
    }
    
    public void heapSort(int nums[])
    {
        for(int i=nums.length-1;i>-0;i--)
        {
            swap(nums,0,i);
            shiftdown(nums,i);
        }
    }
    public static void main(String[] args)
    {
        Sort sort=new Sort();
        //0 0 2 18 53 53 79 87 199
        int[] nums={0,18,79,53,2,87,0,53,199};
        //sort.quickSort(nums);
        //sort.insertSort(nums);
        //sort.selectSort(nums);
        //sort.bubbleSort(nums);
        int[] tmp=new int[nums.length];
        //sort.megerSort(nums,tmp,0,nums.length-1);
        //希尔排序
        //sort.shellSort(nums);
        sort.buildHeap(nums);
        for(int i:nums)
        {
            System.out.print(i+" ");
        }
    }
}
