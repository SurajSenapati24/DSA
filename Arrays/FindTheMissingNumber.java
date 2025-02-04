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
        //T.C=O(n*n)(nearly)
    }
    public static int better(int arr[], int n){
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<n-1;i++){
            hash.add(arr[i]);
        }
        for(int i=1;i<=n;i++){
            if(!hash.contains(i)){
                return i;
            }
        }
        return n+1;
        //T.C=O(m+n)
        //S.C=0(n-1)
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=5;
        System.out.println("The missing number in the array is: "+better(arr, n));
    }
}
