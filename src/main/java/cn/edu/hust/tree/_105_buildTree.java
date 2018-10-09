package cn.edu.hust.tree;

public class _105_buildTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTreehelper(int[] preorder,int start,int end,int[] inorder,int low,int high)
    {
        TreeNode root=new TreeNode(preorder[start]);
        if(start==end)
        {
            if(low==high)
                return root;
        }
        int pos=low;
        //找到根结点
        while(inorder[pos]!=preorder[start])
        {
            pos++;
        }
        int leftLen=pos-low;
        //int leftPos=pos-1;
        //如果有左子树
        if(leftLen>0)
            root.left=buildTreehelper(preorder,start+1,start+leftLen,inorder,low,pos-1);
        //如果有右子树
        if(pos+1<=high)
            root.right=buildTreehelper(preorder,start+leftLen+1,end,inorder,pos+1,high);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0||inorder.length==0||preorder.length!=inorder.length) return null;
        return buildTreehelper(preorder,0,preorder.length-1,inorder,0,preorder.length-1);
    }
}
