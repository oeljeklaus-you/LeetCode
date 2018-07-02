package cn.edu.hust.link;

public class _141_hasCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode p=head;
        ListNode q=head;
        //快慢指针法，如果快的指针追上慢的指针，那么有环
        while(p!=null&&q!=null)
        {
            p=p.next;
            q=q.next;
            if(q!=null)
            {
                q=q.next;
                if(q==p)
                {
                    return true;
                }
            }
            else
                return false;
        }
        return false;
    }
}
