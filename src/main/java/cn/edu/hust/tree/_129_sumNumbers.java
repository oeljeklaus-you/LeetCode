package cn.edu.hust.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _129_sumNumbers {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public void preorder(TreeNode root, Stack<Integer> stack, List<Integer> data)
    {
        if(root==null) return;
        if(root.left==null&&root.right==null)
        {
            int tmp=0;
            stack.push(root.val);
            for(int i=0;i<stack.size();i++)
            {
                tmp=tmp*10+stack.get(i);
            }
            data.add(tmp);
            stack.pop();
            return;
        }
        stack.push(root.val);
        preorder(root.left,stack,data);
        preorder(root.right,stack,data);
        //每一次都要弹出
        stack.pop();
    }
    //解题思路:需要使用遍历解决
    public int sumNumbers(TreeNode root) {
        Stack<Integer> stack=new Stack<Integer>();
        ArrayList<Integer> data=new ArrayList<Integer>();
        preorder(root,stack,data);
        int sum=0;
        for(Integer i:data)
        {
            sum+=i;
        }
        return sum;
    }
}
