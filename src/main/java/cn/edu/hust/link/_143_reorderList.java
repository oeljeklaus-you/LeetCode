package cn.edu.hust.link;

public class _143_reorderList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode order(ListNode head)
    {
        if(head==null||head.next==null||head.next.next==null) return head;
        ListNode p=head.next,t=head.next;
        while(p.next!=null&&p.next.next!=null)
        {
            p=p.next;
        }
        ListNode a=p.next;
        p.next=p.next.next;
        head.next=a;
        head.next.next=order(t);
        return head;
    }
    //解题思路:使用递归，不过要注意判断条件
    public void reorderList(ListNode head) {
        order(head);
    }
    public static void main(String[] args)
    {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        _143_reorderList reorderList=new _143_reorderList();
        reorderList.reorderList(head);
    }
}
