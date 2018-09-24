package cn.edu.hust.tree;

import java.util.ArrayList;
import java.util.List;

public class _230_kthSmallest {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public void kthSmallestHelper(TreeNode root,int k,List<Integer> result)
    {
        if(root==null) return;
        kthSmallestHelper(root.left,k,result);
        result.add(root.val);
        kthSmallestHelper(root.right,k,result);

    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result=new ArrayList<Integer>();
        kthSmallestHelper(root,k,result);
        if(k<=0||k>result.size()) return 0;
        return result.get(k-1);
    }
}
