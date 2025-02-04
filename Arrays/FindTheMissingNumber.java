package Arrays;
import java.util.*;
public class FindTheMissingNumber {
    public static int brute(int arr[],int n){
        int ans=0;
        //Linear Search
        for(int i=1;i<=n;i++){
            int flag=0;
            for(int j=0;j<n-1;j++){
                if(i==arr[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=5;
        System.out.println("The missing number in the array is: "+brute(arr, n));
    }
}
