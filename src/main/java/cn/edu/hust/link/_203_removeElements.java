package cn.edu.hust.link;

public class _203_removeElements {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //删除链表元素一般是先创建一个头节点，这样考虑少一点
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode p=new ListNode(0);
        p.next=head;
        //一定要是p这样避免重复
        ListNode prev=p;
        while(head.next!=null)
        {
            //将这个节点的后一个节点的值复制给它
            if(head.val==val)
            {
                head.val=head.next.val;
                head.next=head.next.next;
            }
            else
            {
                //记录上一个节点以防止最后一个节点的值和要移除的相等。
                prev=head;
                head=head.next;
            }
        }
        if(head.val==val)
        {
            prev.next=null;
        }
        return p.next;
    }
}
