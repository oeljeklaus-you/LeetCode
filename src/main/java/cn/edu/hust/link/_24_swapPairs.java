package cn.edu.hust.link;

public class _24_swapPairs {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //解题思路:先将链表拆分成两组然后合并
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        ListNode l1=new ListNode(0);
        ListNode l2=new ListNode(0);
        ListNode p1=l1,p2=l2;
        ListNode tmp=null;
        int i=0;
        while(head!=null)
        {
            if(i%2==0)
            {
                tmp=head.next;
                p1.next=head;
                p1=p1.next;
                //这里必须赋值为空，不然会出问题
                p1.next=null;
                head=tmp;
            }
            else
            {
                tmp=head.next;
                p2.next=head;
                p2=p2.next;
                p2.next=null;
                head=tmp;
            }
            i++;
        }
        l1=l1.next;
        l2=l2.next;
        p2=new ListNode(0);
        p1=p2;
        i=0;
        while(l1!=null&&l2!=null)
        {
            if(i%2==0)
            {
                tmp=l2.next;
                p1.next=l2;
                p1=p1.next;
                p1.next=null;
                l2=tmp;
            }else
            {
                tmp=l1.next;
                p1.next=l1;
                p1=p1.next;
                p1.next=null;
                l1=tmp;
            }
            i++;
        }
        if(l1!=null) p1.next=l1;
        if(l2!=null) p1.next=l2;
        return p2.next;
    }

}
