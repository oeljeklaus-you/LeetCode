package cn.edu.hust.link;

public class _25_reverseKGroup {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 解题思路:使用递归，主要是先翻转一个然后递归翻转，递归的出口是head的长度小于k
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return head;
        ListNode p=head;
        int count=0;
        while(p!=null)
        {
            p=p.next;
            count++;
        }
        if(count<k) return head;
        p=head;
        ListNode prev=null;
        count=0;
        while(count!=k)
        {
            ListNode next=p.next;
            p.next=prev;
            prev=p;
            p=next;
            count++;
        }
        head.next=reverseKGroup(p,k);
        return prev;
    }
}
