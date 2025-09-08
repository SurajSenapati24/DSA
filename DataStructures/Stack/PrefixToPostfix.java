import java.util.Stack;
public class PrefixToPostfix {
    public static String prefixtopostfix(String exp){
        Stack<String> st=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            if(Character.isLetterOrDigit(exp.charAt(i))){
                st.push(Character.toString(exp.charAt(i)));
            }
            else{
                String t1=st.pop()+st.pop()+Character.toString(exp.charAt(i));
                st.push(t1);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String exp="/-AB*+DEF";
        System.out.println(prefixtopostfix(exp));
    }
}
