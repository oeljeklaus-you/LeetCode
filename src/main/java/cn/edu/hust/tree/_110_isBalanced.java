package cn.edu.hust.tree;

public class _110_isBalanced {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int countHieght(TreeNode root)
    {
        if(root==null) return 0;
        return 1+(countHieght(root.left)>countHieght(root.right)?countHieght(root.left):countHieght(root.right));
    }
    // 一般的简单解法会超时
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left=countHieght(root.left);
        int right=countHieght(root.right);
        if(left-right<=1&&left-right>=-1)
        {
            return isBalanced(root.left)&&isBalanced(root.right);
        }
        return false;
    }
    public boolean countHeight2(TreeNode root,int[] height,int pos)
    {
        if(root==null)
        {
            height[0]=0;
            return true;
        }
        countHeight2(root.left,height,0);
        countHeight2(root.right,height,1);
        if(height[0]-height[1]>=-1&&height[0]-height[1]<=1)
        {
            height[pos]=(height[0]>height[1]?height[0]:height[1])+1;
            return true;
        }
        return countHeight2(root.left,height,0)&&countHeight2(root.right,height,1);
    }
    public boolean isBalanced2(TreeNode root) {
        //if(root==null) return true;
        int[] height=new int[2];
        return countHeight2(root,height,0);
    }

    /**
     * bool isBalancedHelper(TreeNode *root,int *height)
     {
     if(root==NULL) return true;
     int left=0;
     int right=0;
     if(isBalancedHelper(root->left,&left)&&isBalancedHelper(root->right,&right))
     {
     int diff=left-right;
     if(diff<=1&&diff>=-1)
     {
     *height=(left>right?left:right)+1;
     return true;
     }
     }
     return false;
     }
     bool isBalanced(TreeNode* root) {
     int height=0;
     return isBalancedHelper(root,&height);
     }
     */

}
