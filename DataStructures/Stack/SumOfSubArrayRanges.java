import java.util.Stack;
public class SumOfSubArrayRanges {
    public static int[] nse(int[] arr){
        int n=arr.length;
        int nsea[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){ // Non-strict inequality for next element
                st.pop();
            }
            nsea[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return nsea;
    }
    public static int[] pse(int[] arr){
        int n=arr.length;
        int psea[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){ // Strict inequality for previous element
                st.pop();
            }
            psea[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return psea;
    }
    public static long sumOfMinimum(int arr[]){
        long sum=0;
        int n=arr.length;
        int nsea[]=nse(arr);
        int psea[]=pse(arr);
        for(int i=0;i<n;i++){
            long left = i - psea[i];
            long right = nsea[i] - i;
            sum += left * right * arr[i];
        }
        return sum;
    }
    public static int[] nge(int[] arr){
        int n=arr.length;
        int ngea[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){ // Strict inequality for next element
                st.pop();
            }
            ngea[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return ngea;
    }
    public static int[] pge(int[] arr){
        int n=arr.length;
        int pgea[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){ // Non-strict inequality for previous element
                st.pop();
            }
            pgea[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return pgea;
    }
    public static long sumOfMaximum(int arr[]){
        long sum=0;
        int n=arr.length;
        int nsea[]=nge(arr);
        int psea[]=pge(arr);
        for(int i=0;i<n;i++){
            long left = i - psea[i];
            long right = nsea[i] - i;
            sum += left * right * arr[i];
        }
        return sum;
    }
    public static long subArrayRanges(int[] nums) {
        long mini=sumOfMinimum(nums);
        long maxi=sumOfMaximum(nums);
        return maxi-mini;
    }
    public static long brute(int arr[]){
        int n=arr.length;
        long sum=0;
        for(int i=0;i<n;i++){
            int smallest=arr[i];
            int largest=arr[i];
            for(int j=i+1;i<n;i++){
                smallest=Math.min(smallest, arr[j]);
                largest=Math.max(largest,arr[j]);
                sum+=(largest-smallest);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(subArrayRanges(arr));
    }
}
