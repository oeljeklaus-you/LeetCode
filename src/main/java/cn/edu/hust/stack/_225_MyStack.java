package cn.edu.hust.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class _225_MyStack {
    class MyStack {

        private Deque<Integer> q1=new ArrayDeque<Integer>();
        private Deque<Integer> q2=new ArrayDeque<Integer>();
        /** Initialize your data structure here. */
        public MyStack() {

        }

        /** Push element x onto stack. */
        public void push(int x) {
            q1.add(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            while(q1.size()!=1)
            {
                q2.add(q1.peek());
                q1.pop();
            }
            int result=q1.peek();
            q1.pop();
            while(q2.size()!=0)
            {
                q1.add(q2.peek());
                q2.pop();
            }
            return result;

        }

        /** Get the top element. */
        public int top() {
            int tail=0;
            for(int i:q1)
            {
                tail=i;
            }
            return tail;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return q1.size()==0&&q2.size()==0;
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
