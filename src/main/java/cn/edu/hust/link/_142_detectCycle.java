package cn.edu.hust.link;

public class _142_detectCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //这是在原来判断是否有环的基础上进行数学推理即可
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                slow=head;
                while(slow!=fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}
