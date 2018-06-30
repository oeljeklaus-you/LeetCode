package cn.edu.hust.link;

public class _2_addTwoNumbers {
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        int count=0;
        int t1=0;
        int t2=0;
        int tmp=0;
        ListNode p=result;
        while(l1!=null|| l2!=null)
        {
            t1=(l1==null)?0:l1.val;
            t2=(l2==null)?0:l2.val;
            tmp=t1+t2+count;
            p.next=new ListNode(tmp%10);
            count=tmp/10;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            p=p.next;
        }
        if(count!=0) p.next=new ListNode(count);
        return result.next;
    }


}
