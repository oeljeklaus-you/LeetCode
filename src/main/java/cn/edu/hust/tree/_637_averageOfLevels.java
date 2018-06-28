package cn.edu.hust.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class _637_averageOfLevels {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //和层次遍历一样的思路,要注意整形溢出的问题
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<Double>();
        if(root==null) return result;
        Deque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.add(root);
        while(queue.size()!=0)
        {
            int size=queue.size();
            int count=0;
            for(int i=0;i<size;i++)
            {
                TreeNode node=queue.peek();
                queue.pop();
                count+=node.val;
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
            }
            result.add((double)count/size);
        }
        return result;
    }
}
