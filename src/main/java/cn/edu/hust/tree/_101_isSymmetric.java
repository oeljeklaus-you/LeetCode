package cn.edu.hust.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class _101_isSymmetric {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isCycle(List<Integer> data)
    {
        int low=0;
        int high=data.size()-1;
        while(low<high)
        {
            if(data.get(low)==data.get(high))
            {
                low++;
                high--;
            }else
                return false;
        }
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        Deque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.push(root);
        List<Integer> data=new ArrayList<Integer>();
        while(queue.size()!=0)
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                root=queue.peek();
                queue.pop();
                int left=root.left==null?0:root.left.val;
                data.add(left);
                int right=root.right==null?0:root.right.val;
                data.add(right);
                //进队列
                if(root.left!=null)
                    queue.add(root.left);
                if(root.right!=null)
                    queue.add(root.right);
            }
            if(!isCycle(data))
                return false;
            else
                data.clear();
        }
        return true;
    }

    public static void main(String[] args)
    {
        _101_isSymmetric symmetric=new _101_isSymmetric();
        TreeNode root=symmetric.new TreeNode(1);
        root.left=symmetric.new TreeNode(2);
        root.right=symmetric.new TreeNode(2);
        root.left.left=symmetric.new TreeNode(3);
        root.left.right=symmetric.new TreeNode(4);
        root.right.left=symmetric.new TreeNode(4);
        root.right.right=symmetric.new TreeNode(3);
        symmetric.isSymmetric(root);
    }
}
