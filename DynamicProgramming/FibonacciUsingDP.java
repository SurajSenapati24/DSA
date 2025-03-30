import java.util.*;
public class FibonacciUsingDP {
    //Memoization
    public final static int max=100;
    public static int memoization(int n,int dp[]){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        else{
            dp[n]=memoization(n-1, dp)+memoization(n-2, dp);
        }
        return dp[n];
    }
    //Tabulation
    public static int tabulation(int n){
        int secondprev=0,prev=1;
        int curr=0;
        for(int i=2;i<=n;i++){
            curr=prev+secondprev;
            secondprev=prev;
            prev=curr;
        }
        return curr;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term: ");
        int n=sc.nextInt();
        int dp[]=new int[max];
        Arrays.fill(dp, -1);
        System.out.println(tabulation(n));
    }
}
