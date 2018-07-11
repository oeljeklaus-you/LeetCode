package cn.edu.hust.link;

public class _92_reverseBetween {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //使用头插入法，这里注意在链表遍历过程中需要自己定义一个头指针
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null) return head;
        ListNode p=new ListNode(0);
        p.next=head;
        int count=0;
        ListNode q=p;
        //一定要是小于,还有就是从头可是遍历
        while(count<m-1)
        {
            q=q.next;
            count++;
        }
        count++;
        ListNode t=q.next;
        while(count<n)
        {
            ListNode tmp=t.next;
            t.next=tmp.next;
            //这里要是q.next不能是t
            tmp.next=q.next;
            q.next=tmp;
            count++;
        }
        return p.next;
    }

}
