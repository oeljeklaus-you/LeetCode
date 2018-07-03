package cn.edu.hust.string;

import java.util.Stack;

public class _434_countSegments {
    //使用一个栈判断
    public int countSegments(String s) {
        if(s==null||"".equals(s)) return 0;
        int count=0;
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                if(!stack.empty())
                {
                    count++;
                    stack=new Stack<Character>();
                }
            }
        }
        if(!stack.empty()) count++;
        return count;
    }
}
