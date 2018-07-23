package cn.edu.hust.link;

public class _237_deleteNode {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //这里考察的是一种思维也就是删除链表可以将要删除的后一个节点的值赋值到删除节点然后调整链表即可
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
