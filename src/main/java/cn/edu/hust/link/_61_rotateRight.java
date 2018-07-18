package cn.edu.hust.link;

public class _61_rotateRight {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //解题思路:主要是先找出长度取模，然后利用找出倒数第k+1个数据进行拆分链表，合并即可
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0) return head;
        ListNode p=head;
        int count=0;
        while(p!=null)
        {
            p=p.next;
            count++;
        }
        k=k%count;
        //这里还需要增加判断，因为k有可能为长度的倍数这样的话直接返回
        if(k==0) return head;
        //接下来的操作是找到倒数第K+1个节点;
        ListNode q=head;
        p=head;
        count=0;
        while(count!=k)
        {
            p=p.next;
            count++;
        }
        while(p.next!=null)
        {
            p=p.next;
            q=q.next;
        }
        //拆分链表即可
        p=q.next;
        q.next=null;
        q=p;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=head;
        return q;
    }

}
