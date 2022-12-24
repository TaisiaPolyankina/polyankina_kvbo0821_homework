package polyankina_kvbo0821.prac22;

import java.util.Stack;

public class Calculator {

    public static String ExpressionRPN(String Expression){

        String s = "";
        Stack<Character> stack = new Stack<>();

        int priority;
        for(int i = 0;i < Expression.length(); i++){
            priority = priorityOperation(Expression.charAt(i));

            if(priority == 0){
                s += Expression.charAt(i);
            }

            if(priority == 1){
                stack.push(Expression.charAt(i));
            }

            if(priority > 1){
                s += " ";

                while(!stack.empty()){
                    if(priorityOperation(stack.peek()) >= priority){
                        s += stack.pop();
                    }
                    else{
                        break;
                    }
                }
                stack.push(Expression.charAt(i));
            }

            if(priority == -1){
                s += " ";

                while(priorityOperation(stack.peek()) != 1) {
                    s += stack.pop();
                }
                stack.pop();
            }
        }
        while(!stack.empty()){
            s +=stack.pop();
        }
        return s;
    }

    public static double RPNtoCalculate(String rpn){
        String operand = new String();
        Stack<Double> stack = new Stack<>();

        for(int i = 0; i < rpn.length(); i++){
            if(rpn.charAt(i) == ' '){
                continue;
            }

            if(priorityOperation(rpn.charAt(i)) == 0){
                while(rpn.charAt(i) != ' ' && priorityOperation(rpn.charAt(i)) == 0){
                    operand += rpn.charAt(i++);
                    if(i == rpn.length()){
                        break;
                    }
                }
                stack.push(Double.parseDouble(operand));
                operand = new String();
            }

            if(priorityOperation(rpn.charAt(i)) > 1){
                double a = stack.pop();
                double b = stack.pop();

                if(rpn.charAt(i) == '+'){
                    stack.push(b+a);
                }
                if(rpn.charAt(i) == '-'){
                    stack.push(b-a);
                }
                if(rpn.charAt(i) == '*'){
                    stack.push(b*a);
                }
                if(rpn.charAt(i) == '/'){
                    stack.push(b/a);
                }
            }
        }
        return stack.pop();
    }

    private static int priorityOperation(char mathSymbol){
        if(mathSymbol == '*' || mathSymbol == '/'){
            return 3;
        }
        else if (mathSymbol == '+' || mathSymbol == '-'){
            return 2;
        }
        else if (mathSymbol == '('){
            return 1;
        }
        else if (mathSymbol == ')'){
            return -1;
        }
        else{
            return 0;
        }
    }


}
