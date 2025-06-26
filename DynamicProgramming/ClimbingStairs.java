import java.util.*;
public class ClimbingStairs {
    public static int count(int n){
        if(n<=2) return n;
        int first=1;
        int second=2;
        int curr=0;
        for(int i=3;i<=n;i++){
            curr=first+second;
            first=second;
            second=curr;
        }
        return curr;
    }
    public int climbStairs(int n) {
        int arr[]=new int[n+1];
        if (n<=1) return 1;
        else{
            arr[0]=1;
            arr[1]=1;
            for(int i=2;i<=n;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
        return arr[n];
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(count(n));
    }
}
