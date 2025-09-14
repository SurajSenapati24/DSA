import java.util.Arrays;
import java.util.Stack;
public class AsteroidsCollision {
    public static int[] optimal(int arr[]){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int ast:arr){
            if(ast>0){
                st.push(ast);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(ast)){
                    st.pop();
                }
                if(!st.isEmpty() && ast==st.peek()) st.pop();
                else if(st.isEmpty()||st.peek()<0) st.push(ast);
            }
        }
        int ans[]=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={5,10,-5};
        System.out.println(Arrays.toString(optimal(arr)));
    }
}
