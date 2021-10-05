package dsa;

import java.util.Stack;

class StackImpl {

    private int top = -1;
    private int[] stackarr = new int[100];

    public int peek(){
        return stackarr[top];
    }

    public void push(int ele){
        if(top == -1){
            top = 0;
            stackarr[top] = ele;
        }else{
            top = top + 1;
            stackarr[top] = ele;
        }
    }

    public int pop(){
        int temp = stackarr[top];
        top = top -1;
        return temp;
    }
}

public class CustomStack{
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);


        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
