package cn.edu.hust.tree;

public class _100_isSameTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //没什么技巧递归即可
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q!=null) return false;
        if(p!=null&&q==null) return false;
        if(p==null&&q==null) return true;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
