import java.util.Stack;

public class PostfixToInfix {
    public static String postfixtoinfix(String exp) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                st.push(Character.toString(ch));
            } else {
                String op1 = st.pop();
                String op2 = st.pop();
                String result = "(" + op2 + ch + op1 + ")";
                st.push(result);
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        String post = "AB+C*DE/-";
        System.out.println("Postfix: " + post);
        System.out.println("Infix: " + postfixtoinfix(post));
    }
}
