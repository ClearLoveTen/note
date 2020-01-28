package _155_最小栈;

import java.util.Stack;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/4 21:41
 */
public class MinStack {


    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {

    }

    public void push(int x) {


        stack.push(x);
        if (min.size() == 0) {
            min.push(x);
        } else {
            min.push(Math.min(x, min.peek()));
        }


    }

    public void pop() {

        min.pop();
        stack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {

        return min.peek();
    }


}
