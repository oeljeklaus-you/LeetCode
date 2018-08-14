package cn.edu.hust.tree;

import java.util.ArrayList;
import java.util.List;

public class _98_isValidBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    // 解题思路:利用二叉搜索树的性质，中序遍历是排好序的
    public void minOrder(TreeNode root,List<Integer> num)
    {
        if(root==null) return;
        minOrder(root.left,num);
        num.add(root.val);
        minOrder(root.right,num);
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> num=new ArrayList<Integer>();
        minOrder(root,num);
        int moveCount=0;
        Integer[] nums=num.toArray(new Integer[0]);
        for(int i=1;i<nums.length;i++)
        {
            int j=i;
            while(j>0&&nums[j]<=nums[j-1])
            {
                int tmp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=tmp;
                j--;
                moveCount++;
            }
        }
        return moveCount==0;
    }
}
