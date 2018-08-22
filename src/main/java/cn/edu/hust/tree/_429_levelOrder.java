package cn.edu.hust.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class _429_levelOrder {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    //思路同二叉树的层次遍历
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root==null) return result;
        Deque<Node> queue=new ArrayDeque<Node>();
        queue.add(root);
        while(queue.size()!=0)
        {
            List<Integer> tmp=new ArrayList<Integer>();
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                root=queue.pop();
                tmp.add(root.val);
                for(Node t:root.children)
                {
                    queue.add(t);
                }
            }
            result.add(tmp);
        }
        return result;
    }
}
