package cn.edu.hust.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class _226_invertTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        Deque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.push(root);
        while(queue.size()!=0)
        {
            TreeNode root1=queue.pop();
            TreeNode tmp=root1.left;
            root1.left=root1.right;
            root1.right=tmp;
            if(root1.left!=null)
                queue.push(root1.left);
            if(root1.right!=null)
                queue.push(root1.right);
        }
        return root;
    }
}
