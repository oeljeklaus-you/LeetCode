package cn.edu.hust.tree;

import java.util.ArrayList;
import java.util.List;

public class _590_postorder {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public void postorderHelper(Node root,List<Integer> result)
    {
        if(root==null) return;

        for(int i=0;i<root.children.size();i++)
        {
            postorderHelper(root.children.get(i),result);
        }
        result.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> result=new ArrayList<Integer>();
        postorderHelper(root,result);
        return result;
    }
}
