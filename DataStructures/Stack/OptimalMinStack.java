import java.util.Stack;
public class OptimalMinStack {
    Stack<Integer> st=new Stack<>();
    int min=Integer.MAX_VALUE;
    public void push(int val){
        if(st.isEmpty()){
            st.push(val);
            min=val;
        }
        else{
            if(val>min) st.push(val);
            else{
                st.push(2*val-min);
                min=val;
            }
        }
    }
    public void pop(){
        if(st.isEmpty()){
            System.out.println("Stack is empty");
            return;
        } 
        if(min<st.peek()){
            System.out.println("Popped: "+st.pop());
        }
        else{
            int x=st.peek();
            System.out.println("Popped: "+min);
            min=2*min-x;
        }
    }
    public void peek(){
        if(st.isEmpty()){
            System.out.println("Stack is empty");
            return;
        } 
        if(min<st.peek()){
            System.out.println("Top: "+st.peek());
        }
        else{
            System.out.println("Top: "+min);
        }
    }
    public int getMin(){
        return min;
    }
    public static void main(String[] args) {
        OptimalMinStack st=new OptimalMinStack();
        st.push(15);
        st.push(12);
        st.push(10);
        st.push(11);
        st.peek();
        st.pop();
        st.peek();
        System.out.println(st.getMin());
    }
}
