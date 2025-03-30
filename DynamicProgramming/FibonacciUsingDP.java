import java.util.*;
public class FibonacciUsingDP {
    public final static int max=100;
    public static int fact(int n,int dp[]){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        else{
            dp[n]=fact(n-1, dp)+fact(n-2, dp);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term: ");
        int n=sc.nextInt();
        int dp[]=new int[max];
        Arrays.fill(dp, -1);
        System.out.println(fact(n, dp));
    }
}
