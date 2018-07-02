package cn.edu.hust.link;

public class _21_mergerList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //递归即可
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return mergerListHelper(l1,l2);
    }
}
