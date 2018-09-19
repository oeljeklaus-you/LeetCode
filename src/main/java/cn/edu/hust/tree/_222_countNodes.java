package cn.edu.hust.tree;

public class _222_countNodes {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //首先计算高度然后计算数量
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        TreeNode left=root,right=root;
        int height=0;
        while(right!=null)
        {
            left=left.left;
            right=right.right;
            height++;
        }
        if(left==null) return (1<<height)-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
