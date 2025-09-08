import java.util.Stack;
public class PrefixToInfix {
    public static String prefixtoinfix(String exp){
        Stack<String> st=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            if(Character.isLetterOrDigit(exp.charAt(i))){
                st.push(Character.toString(exp.charAt(i)));
            }
            else{
                String t1=st.pop();
                String t2=st.pop();
                String t3="("+t1+Character.toString(exp.charAt(i))+t2+")";
                st.push(t3);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String exp="-*+ABC/DE";
        System.out.println(prefixtoinfix(exp));
    }
}
