package cn.edu.hust.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class _404_sumOfLeftLeaves {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //层次遍历计算每个左叶子节点只和即可
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        Deque<TreeNode> q=new ArrayDeque<TreeNode>();
        int sum=0;
        q.push(root);

        while(q.size()!=0)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                root=q.pop();
                if(root.left!=null)
                {
                    q.add(root.left);
                    if(root.left.left==null&&root.left.right==null)
                        sum+=root.left.val;
                }
                if(root.right!=null)
                {
                    q.add(root.right);
                }
            }
        }
        return sum;
    }
}
