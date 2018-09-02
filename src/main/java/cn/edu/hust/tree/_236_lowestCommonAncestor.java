package cn.edu.hust.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _236_lowestCommonAncestor {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //解题思路:可以转化为两个链表公共子节点
    public boolean getPath(TreeNode root, Stack<TreeNode> path, TreeNode t)
    {
        if(root==t)
        {
            path.push(root);
            return true;
        }
        path.push(root);
        boolean found=false;
        List<TreeNode> list=new ArrayList<TreeNode>();
        if(root.left!=null)
            list.add(root.left);
        if(root.right!=null)
            list.add(root.right);
        int count=0;
        while(!found&&count<list.size())
        {
            found=getPath(list.get(count),path,t);
            count++;
        }
        if(!found)
            path.pop();
        return found;
    }

    public TreeNode getCommonAncestor(Stack<TreeNode> path1,Stack<TreeNode> path2)
    {
        if(path1.size()==0||path2.size()==0) return null;
        if(path1.size()>path2.size())
        {
            while(path1.size()!=path2.size())
            {
                path1.pop();
            }
        }
        else if(path1.size()<path2.size())
        {
            while(path1.size()!=path2.size())
            {
                path2.pop();
            }
        }
        while(path1.peek()!=path2.peek())
        {
            path1.pop();
            path2.pop();
        }
        return path1.peek();
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||p==null||q==null) return null;
        Stack<TreeNode> path1=new Stack<TreeNode>();
        Stack<TreeNode> path2=new Stack<TreeNode>();
        getPath(root,path1,p);
        getPath(root,path2,q);
        return getCommonAncestor(path1,path2);
    }

    public static void main(String[] args)
    {
        _236_lowestCommonAncestor ancestor=new _236_lowestCommonAncestor();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(5);
        root.right=new TreeNode(1);
        root.left.left=new TreeNode(6);
        root.left.right=new TreeNode(2);
        root.left.right.left=new TreeNode(7);
        root.left.right.right=new TreeNode(4);
        root.right.left=new TreeNode(0);
        root.right.right=new TreeNode(8);
        ancestor.lowestCommonAncestor(root,root.left,root.left.right.right);
    }
}
