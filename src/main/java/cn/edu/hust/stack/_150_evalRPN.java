package cn.edu.hust.stack;

import java.util.Stack;

public class _150_evalRPN {
    public boolean isOpt(String c)
    {
        return (c.equals("+"))||(c.equals("-"))||(c.equals("*"))||(c.equals("/"));
    }
    //求解的是操作数就进行压栈，遇到操作符就出栈，弹出两个数字计算，如果不能就出错
    public int evalRPN(String[] tokens) {
        if(tokens==null||tokens.length==0) return 0;
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<tokens.length;i++)
        {
            if(isOpt(tokens[i]))
            {
                int a=stack.peek();
                stack.pop();
                int b=stack.peek();
                stack.pop();
                if(tokens[i].equals("+"))
                {
                    stack.push(a+b);
                }else if(tokens[i].equals("-"))
                {
                    stack.push(b-a);
                }else if(tokens[i].equals("*"))
                {
                    stack.push(a*b);
                }
                else
                {
                    stack.push(b/a);
                }
            }
            else
            {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.peek();
    }
}
