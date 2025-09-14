import java.util.Stack;
public class SumOfSubarrayMinimums {
    public static int[] nextSmallerElements(int arr[]){
        int nse[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }
        return nse;
    }
    public static int[] previousSmallerElements(int arr[]){
        int n=arr.length;
        int pse[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return pse;
    }
    public static int optimal(int arr[]){
        int sum=0;
        int MOD=(int)1e9+7;
        int nse[]=nextSmallerElements(arr);
        int pse[]=previousSmallerElements(arr);
        for(int i=0;i<arr.length;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            sum=(sum+(left*right*arr[i]))%MOD;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={3,1,2,4};
        System.out.println(optimal(arr));
    } 
}
