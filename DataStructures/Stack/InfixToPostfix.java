import java.util.*;
import java.util.Stack;
public class InfixToPostfix {
    public static int getPrecedence(char c){
        switch (c) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return -1;
    }
    public static String infixtopostfix(String expression){
        StringBuilder ans=new StringBuilder();
        Stack <Character> st=new Stack<>();
        for(char c : expression.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                ans.append(c);
            }
            else if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && getPrecedence(c)<=getPrecedence(st.peek()) && st.peek()!='^'){
                    ans.append(st.pop());
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            if(st.peek()==')'){
                return "Invalid Expression";
            }
            else{
                ans.append(st.pop());
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String infixExpression = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix Expression: " + infixExpression);
        String postfixExpression = infixtopostfix(infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);

        System.out.println("\n--------------------------------------\n");

        String infixExpression2 = "x^y/(5*z)+2";
        System.out.println("Infix Expression: " + infixExpression2);
        String postfixExpression2 = infixtopostfix(infixExpression2);
        System.out.println("Postfix Expression: " + postfixExpression2);
    }
}
