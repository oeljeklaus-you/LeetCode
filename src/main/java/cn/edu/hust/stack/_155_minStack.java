package cn.edu.hust.stack;

import java.util.Stack;

public class _155_minStack {
    class MinStack {
        private Stack<Integer> stack1=new Stack<Integer>();
        private Stack<Integer> stack2=new Stack<Integer>();
        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {
            stack1.push(x);
            if(stack2.empty())
            {
                stack2.push(x);
            }
            else
            {
                if(stack2.peek()>x)
                {
                    stack2.push(x);
                }
                else
                {
                    stack2.push(stack2.peek());
                }
            }
        }

        public void pop() {
            stack1.pop();
            stack2.pop();
        }

        public int top() {
            return stack1.peek();
        }

        public int getMin() {
            return stack2.peek();
        }
    }
}
