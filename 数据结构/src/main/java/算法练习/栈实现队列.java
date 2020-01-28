package 算法练习;

import java.util.Stack;

public class 栈实现队列 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();


    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {

        //把11号栈所有元素放入二号栈
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int a = stack2.pop();
        while ( !stack2.empty()) {
            stack2.push(stack1.pop());
        }
        return a;

    }
}