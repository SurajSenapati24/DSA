import java.util.Collections;
import java.util.Stack;
class Pair{
    private int first;
    private int second;
    public Pair(int f, int s){
        first=f;
        second=s;
    }
    public int getSecond(){
        return second;
    }
    @Override
    public String toString(){
        return Integer.toString(first);
    }
}
public class MinStackImplementation {
    Stack<Pair> st=new Stack<>();
    public void push(int val){
        if(st.isEmpty()){
            st.push(new Pair(val, val));
        }
        else{
            st.push(new Pair(val, Math.min(val,st.peek().getSecond())));
        }
    }
    public int getMin(){
        if(st.isEmpty()) return -1;
        return st.peek().getSecond();
    }
    public void pop(){
        if(st.isEmpty()) System.out.println("Stack is empty");
        else{
            System.out.println("Popped: "+st.pop().toString());
        }
    }
    public void peek(){
        if(st.isEmpty()) System.out.println("Stack is empty");
        else{
            System.out.println("Top: "+st.peek().toString());
        }
    }
    public static void main(String[] args) {
        MinStackImplementation st=new MinStackImplementation();
        st.push(3);
        st.push(4);
        st.push(1);
        st.push(2);
        System.out.println(st.getMin());
        st.peek();
        st.pop();
    }

}
