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
    public static void main(String[] args) {
        int n=4;
        System.out.println(count(n));
    }
}
