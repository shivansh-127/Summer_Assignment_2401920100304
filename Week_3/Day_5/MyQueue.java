package Week_3.Day_5;

import java.util.Stack;

public class MyQueue {
     public MyQueue() {
    }
     Stack<Integer> s1 = new Stack<>();
     Stack<Integer> s2 = new Stack<>();
    
    
    public void push(int x) {
      while(!s1.isEmpty()) {
        s2.push(s1.pop());
      }
      s1.push(x);
      while(!s2.isEmpty()) {
        s1.push(s2.pop());
      }
    }
    
    public int pop() {
        int top = s1.pop();
        return top;
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}
