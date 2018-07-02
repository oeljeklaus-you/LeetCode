package cn.edu.hust.string;

import java.util.Stack;

public class _20_isValid {
    public boolean isValid(String s) {
        if(s==null||s.equals("")) return true;
        Stack<Character> stack=new Stack<Character>();
        String s1="()";
        String s2="[]";
        String s3="{}";
        for(int i=0;i<s.length();i++)
        {
            if(stack.empty())
            {
                stack.push(s.charAt(i));
                continue;
            }
            char c=stack.peek();
            String tmp=""+c+s.charAt(i);
            if(tmp.equals(s1)||tmp.equals(s2)||tmp.equals(s3))
            {
                stack.pop();
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        if(stack.empty()) return true;
        return false;
    }


}
