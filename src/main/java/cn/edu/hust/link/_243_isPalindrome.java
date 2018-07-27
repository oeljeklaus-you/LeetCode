package cn.edu.hust.link;

public class _243_isPalindrome {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //这里的解题思路是:先使用快慢指针找到中间节点然后翻转，然后逐渐判断即可
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        //这个时候指针slow指向中间节点
        ListNode t=slow.next;
        slow.next=null;
        ListNode prev=null;
        while(t!=null)
        {
            ListNode next=t.next;
            t.next=prev;
            prev=t;
            t=next;
        }
        slow.next=prev;
        fast=head;
        slow=slow.next;
        while(slow!=null)
        {
            if(slow.val!=fast.val)
            {
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
}
