package cn.edu.hust.tree;


import java.util.*;


public class _102_levelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //切记判断root为null的情况
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root==null) return result;
        Deque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.add(root);
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
            result.add(tmp);
        }
        return result;
    }
}
