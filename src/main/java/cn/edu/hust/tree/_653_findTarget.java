package cn.edu.hust.tree;

import java.util.ArrayList;
import java.util.List;

public class _653_findTarget {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public void getSortArray(TreeNode root,List<Integer> array){
        if(root==null) return;
        getSortArray(root.left,array);
        array.add(root.val);
        getSortArray(root.right,array);
    }
    // 解题思路是二叉搜索树的中序遍历是有序的，这道题是167的变种
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> numbers=new ArrayList<Integer>();
        getSortArray(root,numbers);
        int low=0;
        int high=numbers.size()-1;
        boolean flag=false;
        while(low<high)
        {
            while(low<high&&numbers.get(low)+numbers.get(high)<k) low++;
            while(low<high&&numbers.get(low)+numbers.get(high)>k) high--;
            if(low!=high&&numbers.get(low)+numbers.get(high)==k)
            {
                flag=true;
                break;
            }

        }
        return flag;
    }
}
