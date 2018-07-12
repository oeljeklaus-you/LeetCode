package cn.edu.hust.stack;

import java.util.Stack;

public class _32_longestValidParentheses {
    //这里使用栈来进保存字符索引
    public int longestValidParentheses(String s) {
        if(s==null||"".equals(s)) return 0;
        Stack<Integer> stack=new Stack<Integer>();
        int result=0;
        int j=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(i);
            }
            //只有当是')'才开始计更新
            else
            {
                if(stack.empty())
                {
                    j=i;
                }
                else
                {
                    stack.pop();
                    if(stack.empty())
                    {
                        result=Math.max(result,i-j);
                    }//如果没有清除就直接减去栈顶位置
                    else
                    {
                        result=Math.max(result,i-stack.peek());
                    }
                }

            }
        }
        return result;
    }
}
