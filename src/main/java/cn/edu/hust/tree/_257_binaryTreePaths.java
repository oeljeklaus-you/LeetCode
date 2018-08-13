package cn.edu.hust.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _257_binaryTreePaths {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public void getPath(TreeNode root,List<String> result,Stack<String> paths)
    {
        if(root==null) return ;
        if(root.left==null&&root.right==null)
        {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<paths.size();i++)
            {
                sb.append(paths.get(i));
            }
            sb.append(root.val);
            result.add(sb.toString());
        }
        paths.push(""+root.val);
        paths.push("->");
        getPath(root.left,result,paths);
        getPath(root.right,result,paths);
        paths.pop();
        paths.pop();
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList();
        Stack<String> paths=new Stack<String>();
        getPath(root,result,paths);
        return result;
    }
}
