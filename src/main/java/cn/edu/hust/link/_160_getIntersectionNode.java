package cn.edu.hust.link;

public class _160_getIntersectionNode {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //解题思路首先是得到两条链表的长度，然后长链表先遍历在判断
    public ListNode getCommonNode(ListNode headA,ListNode headB,int len)
    {
        int count=0;
        while(count<len)
        {
            headA=headA.next;
            count++;
        }
        while(headA!=headB)
        {
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
    int getLen(ListNode headA)
    {
        int len=0;
        while(headA!=null)
        {
            headA=headA.next;
            len++;
        }
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=getLen(headA);
        int lenB=getLen(headB);
        if(lenA>lenB)
        {
            return getCommonNode(headA,headB,lenA-lenB);
        }
        else
        {
            return getCommonNode(headB,headA,lenB-lenA);
        }
    }
}
