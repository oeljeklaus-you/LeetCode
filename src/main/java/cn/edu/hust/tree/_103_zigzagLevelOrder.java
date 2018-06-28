package cn.edu.hust.tree;

import java.util.*;

public class _103_zigzagLevelOrder {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root==null) return result;
        Deque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.add(root);
        int count=1;
        while(queue.size()!=0)
        {
            int size=queue.size();
            List<Integer> tmp=new ArrayList<Integer>();
            for(int i=0;i<size;i++)
            {
                TreeNode node=queue.peek();
                queue.pop();
                tmp.add(node.val);
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
            }
            //翻转链表
            if((count&1)==0)
            {
                Collections.reverse(tmp);
            }
            result.add(tmp);
            count++;
        }
        return result;
    }
}
