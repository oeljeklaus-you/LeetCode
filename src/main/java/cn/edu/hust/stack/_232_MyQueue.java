package cn.edu.hust.stack;

import java.util.Stack;

public class _232_MyQueue {
    //使用栈模拟队列，一个栈
    class MyQueue {

        private Stack<Integer> stack1=new Stack<Integer>();
        private Stack<Integer> stack2=new Stack<Integer>();
        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            stack1.push(x);
        }

        //移除数组，如果栈2有元素直接移除，如果没有将栈1的元素全部移动到栈2，然后在移除
        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(!stack2.empty())
            {
                int top=stack2.peek();
                stack2.pop();
                return top;
            }
            while(!stack1.empty())
            {
                int top=stack1.peek();
                stack2.push(top);
                stack1.pop();
            }
            int top=stack2.peek();
            stack2.pop();
            return top;
        }

        //如果栈2有直接返回，否则取栈的元素
        /** Get the front element. */
        public int peek() {
            if(!stack2.empty())
                return stack2.peek();
            while(!stack1.empty())
            {
                int top=stack1.peek();
                stack2.push(top);
                stack1.pop();
            }
            return stack2.peek();
        }

        //判断两个栈时候为空
        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stack1.empty()&&stack2.empty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
