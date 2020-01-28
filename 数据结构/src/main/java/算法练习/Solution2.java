package 算法练习;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 定义一个最小值 栈，和数据栈正常进出，每次添加当前栈对应的最小值。
 */
public class Solution2 {

    Stack<Integer> stack=new Stack<Integer>();
     Stack<Integer> min=new Stack<Integer>();

    public void push(int node) {
        stack.push(node);
        
        if(min.empty()){
            min.push(node);
            
         
        }else{
           if(node<min.peek()){
               min.push(node);
           }else{
               
                min.push(min.peek());
           }
            
            
        }

   
    }
    
    public void pop() {
         stack.pop();
         min.pop();

        
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
       return min.peek();
        
    }
}