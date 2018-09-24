package cn.edu.hust.tree;

public class _574_isSubtree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSubtreeHelper(TreeNode s,TreeNode t)
    {
        if(s==null&&t==null) return true;
        else if(s==null||t==null) return false;
        if(s.val!=t.val) return false;
        return isSubtreeHelper(s.left,t.left)&&isSubtreeHelper(s.right,t.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {

        boolean flag=false;
        if(s!=null&&t!=null)
        {
            flag=isSubtreeHelper(s,t);
            if(!flag)
                flag=isSubtree(s.left,t);
            if(!flag)
                flag=isSubtree(s.right,t);
        }
        return flag;
    }
}
