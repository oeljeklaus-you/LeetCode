package cn.edu.hust.tree;

public class _106_buildTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTreeHelper(int[] inorder,int start,int end,int[] postorder,int low,int high)
    {
        TreeNode root=new TreeNode(postorder[high]);
        if(start==end)
        {
            if(low==high)
                return root;
        }
        int pos=start;
        while(inorder[pos]!=postorder[high])
        {
            pos++;
        }
        int leftLen=pos-start;
        if(leftLen>0)
            root.left=buildTreeHelper(inorder,start,pos-1,postorder,low,low+leftLen-1);
        if(pos+1<=end)
            root.right=buildTreeHelper(inorder,pos+1,end,postorder,low+leftLen,high-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0||postorder.length==0||inorder.length!=postorder.length) return null;
        return buildTreeHelper(inorder,0,inorder.length-1,postorder,0,inorder.length-1);
    }
}
