package cn.edu.hust.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class _515_largestValues {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int getMax(List<Integer> data)
    {
        int max=data.get(0);
        for(int i=1;i<data.size();i++)
        {
            if(data.get(i)>max)
                max=data.get(i);
        }
        return max;
    }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        if(root==null) return result;
        Deque<TreeNode> q=new ArrayDeque<TreeNode>();
        q.push(root);
        while(q.size()!=0)
        {
            int size=q.size();
            List<Integer> tmp=new ArrayList<Integer>();
            for(int i=0;i<size;i++)
            {
                root=q.pop();
                tmp.add(root.val);
                if(root.left!=null)
                    q.add(root.left);
                if(root.right!=null)
                    q.add(root.right);
            }
            result.add(getMax(tmp));
        }
        return result;
    }
}
