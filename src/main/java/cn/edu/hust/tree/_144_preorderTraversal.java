package cn.edu.hust.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _144_preorderTraversal {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //非对递归解法
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        while(root!=null||stack.size()!=0)
        {
            while(root!=null)
            {
                result.add(root.val);
                stack.push(root);
                root=root.left;
            }
            if(stack.size()!=0)
            {
                TreeNode top=stack.peek();
                stack.pop();
                root=top.right;
            }
        }
        return result;
    }
}
