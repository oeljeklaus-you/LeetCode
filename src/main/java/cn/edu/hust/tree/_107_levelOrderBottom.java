package cn.edu.hust.tree;

import java.util.*;

public class _107_levelOrderBottom {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //借助一个栈
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root==null) return result;
        Deque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.add(root);
        Stack<List<Integer>> resultTmp=new Stack<List<Integer>>();
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
            resultTmp.add(tmp);
        }
        while(resultTmp.size()!=0)
        {
            result.add(resultTmp.peek());
            resultTmp.pop();
        }
        return result;
    }
}
