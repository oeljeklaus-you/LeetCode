package cn.edu.hust.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class _111_minDepth {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //进行层次遍历即可，最小的深度也就是第一个叶子节点的深度
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Deque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.push(root);
        int depth=0;
        while(queue.size()!=0)
        {
            int size=queue.size();
            depth++;
            for(int i=0;i<size;i++)
            {
                root=queue.pop();
                if(root.left==null&&root.right==null)
                    return depth;
                if(root.left!=null)
                    queue.add(root.left);
                if(root.right!=null)
                    queue.add(root.right);
            }
        }
        return depth;
    }
}
