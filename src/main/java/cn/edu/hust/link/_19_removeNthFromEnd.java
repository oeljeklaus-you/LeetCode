package cn.edu.hust.link;

public class _19_removeNthFromEnd {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //解题思路:主要是按照找出倒数第k个节点,可以使用双指针,这里主要是求节点的前一个
    //这里主要是使用一个头指针解决很多删除问题
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        ListNode result=new ListNode(0);
        result.next=head;
        ListNode p1=head;
        ListNode p2=result;
        int count=0;
        while(count!=n-1)
        {
            p1=p1.next;
            count++;
        }
        while(p1.next!=null)
        {
            p1=p1.next;
            p2=p2.next;
        }

        p2.next=p2.next.next;
        return result.next;
    }
}
