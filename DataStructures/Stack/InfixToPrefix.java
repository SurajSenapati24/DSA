import java.util.Stack;
import java.util.*;
public class InfixToPrefix {
    public static String reverse(String exp){
        StringBuilder rev=new StringBuilder();
        for(int i=exp.length()-1;i>=0;i--){
            if(exp.charAt(i)==')') rev.append('(');
            else if(exp.charAt(i)=='(') rev.append(')');
            else{
                rev.append(exp.charAt(i));
            }
        }
        return rev.toString();
    }
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
    public static String infixtoprefix(String exp){
        String temp=reverse(exp);
        StringBuilder ans=new StringBuilder();
        Stack <Character> st=new Stack<>();
        for(char c : temp.toCharArray()){
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
        return ans.reverse().toString();

    }
    public static void main(String[] args) {
        String infixExpression = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix Expression: " + infixExpression);
        String prefixExpression = infixtoprefix(infixExpression);
        System.out.println("Postfix Expression: " + prefixExpression);

        System.out.println("\n--------------------------------------\n");

        String infixExpression2 = "x^y/(5*z)+2";
        System.out.println("Infix Expression: " + infixExpression2);
        String prefixExpression2 = infixtoprefix(infixExpression2);
        System.out.println("Postfix Expression: " + prefixExpression2);
    }
}
