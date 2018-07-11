package cn.edu.hust.link;

public class _89_deleteDuplicates {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //将重复节点删除即可
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode result=new ListNode(0);
        result.next=head;
        ListNode p=head;
        while(p.next!=null)
        {
            if(p.val==p.next.val)
            {
                p.next=p.next.next;
            }
            else p=p.next;
        }
        return result.next;
    }
}
