package cn.edu.hust.link;

public class _23_mergeKLists {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergerListHelper(ListNode l1, ListNode l2)
    {
        if(l1==null) return l2;
        else if(l2==null) return l1;
        ListNode result=new ListNode(0);
        if(l1.val>l2.val)
        {
            result.val=l2.val;
            result.next=mergerListHelper(l1,l2.next);
        }
        else
        {
            result.val=l1.val;
            result.next=mergerListHelper(l1.next,l2);
        }
        return result;
    }
//在21题的基础上进行分治，
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0) return null;
        int end=lists.length-1;
        int begin=0;
        //if(lists.length==1) return lists[0];
        while(end>0)
        {
            begin=0;
            //前后合并，每一次合并放在前面即可
            while(end>begin)
            {
                lists[begin]=mergerListHelper(lists[begin],lists[end]);
                end--;
                begin++;
            }
        }
        return lists[0];
    }
}
