import java.util.Stack;
public class PostfixToPrefix {
    public static String postfixtoprefix(String exp){
        Stack<String> st=new Stack<>();
        for(int i=0;i<exp.length();i++){
            if(Character.isLetterOrDigit(exp.charAt(i))){
                st.push(Character.toString(exp.charAt(i)));
            }
            else{
                String t1=st.pop();
                String t2=st.pop();
                String t3=Character.toString(exp.charAt(i))+t2+t1;
                st.push(t3);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String post = "AB-DE+F*/";
        System.out.println("Postfix: " + post);
        System.out.println("Prefix: " + postfixtoprefix(post));
    }
}
