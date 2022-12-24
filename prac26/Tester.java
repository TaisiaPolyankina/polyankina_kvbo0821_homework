package polyankina_kvbo0821.prac26;

import java.util.Stack;

public class Tester {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(235);
        stack.push(491);
        stack.push(203);
        stack.push(302);
        stack.push(301);
        stack.push(203);
        stack.push(960);
        stack.push(958);
        stack.push(596);
        stack.push(193);
        stack.push(430);
        stack.push(42);
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);

    }

    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int data  = stack.peek();
        stack.pop();
        reverseStack(stack);
        insertBottom(stack, data);
    }

    public static void insertBottom(Stack<Integer> stack, int value){
        if(stack.isEmpty()){
            stack.push(value);
        }
        else {
            int prevData = stack.peek();
            stack.pop();
            insertBottom(stack, value);
            stack.push(prevData);
        }
    }
}
