package cn.edu.hust.link;

public class _81_deleteDuplicates {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //0-1-2-3-3-4-4-5
    //删除重复的元素，这一类题没什么技巧，就是考察编程能力
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode result=new ListNode(0);
        result.next=head;
        ListNode p=result,q=result.next;
        while(p.next!=null)
        {
            if(q.next!=null&&q.val==q.next.val)
            {
                while(q.next!=null&&q.val!=q.next.val)
                {
                    q=q.next;
                }
                p.next=q.next;
                q=q.next;
            }
            else
            {
                p=p.next;
                q=q.next;
            }
        }
        return result.next;
    }

}
