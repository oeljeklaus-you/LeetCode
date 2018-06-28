package cn.edu.hust.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _94_inorderTraversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }
   //这是递归求解
    public void inorderTraversalHelper(TreeNode root, List<Integer> result)
    {
        if(root==null)
        {
            return ;
        }
        inorderTraversalHelper(root.left,result);
        result.add(root.val);
        inorderTraversalHelper(root.right,result);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        inorderTraversalHelper(root,result);
        return result;
    }

    //使用非递归求解
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        while(root!=null||stack.size()!=0)
        {
            while(root!=null)
            {
                stack.push(root);
                root=root.left;
            }
            if(stack.size()!=0)
            {
                TreeNode top=stack.peek();
                stack.pop();
                result.add(top.val);
                root=top.right;
            }
        }
        return result;
    }
}
