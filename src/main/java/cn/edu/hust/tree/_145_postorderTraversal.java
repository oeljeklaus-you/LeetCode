package cn.edu.hust.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _145_postorderTraversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  //解题思路:使用一个栈和LinkedList，利用LinkedList的特性先计算右子树后计算左子树
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result=new LinkedList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        if(root==null) return result;
        stack.push(root);
        while(stack.size()!=0)
        {
            root=stack.pop();
            result.addFirst(root.val);
            if(root.left!=null)
                stack.push(root.left);
            if(root.right!=null)
                stack.push(root.right);
        }
        return result;
    }
}
