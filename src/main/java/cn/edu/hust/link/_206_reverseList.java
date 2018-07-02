package cn.edu.hust.link;

public class _206_reverseList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev=null,next=null;
        while(head!=null)
        {
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;

    }
}
