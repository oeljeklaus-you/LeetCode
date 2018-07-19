package cn.edu.hust.tree;

import java.util.ArrayList;
import java.util.List;

public class _589_preorder {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public void preOrderHelper(Node root,List<Integer> result)
    {
        if(root==null) return;
        result.add(root.val);
        for(int i=0;i<root.children.size();i++)
        {
            preOrderHelper(root.children.get(i),result);
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> result=new ArrayList<Integer>();
        preOrderHelper(root,result);
        return result;
    }
}
