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
    //Sum approach
    public static int optimal_1(int arr[],int n){
        int t_sum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }
        return t_sum-sum;
        //T.C=O(n)
        //S.C=O(1)
    }
    //XOR approach
    public static int optimal_2(int arr[],int n){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor2^=arr[i];
            xor1^=i+1;
        }
        xor1^=n;
        return xor1^xor2;
        //T.C=O(n)
        //S.C=O(1)
    }
    public static void main(String[] args) {
        int arr[]={2,19,10,1,5,3,13,18,24,23,9,22,28,25,6,27,4,20,21,26,11,8,17,15,16,12,7,14};
        int n=29;
        System.out.println("The missing number in the array is: "+optimal_2(arr, n));
    }
}
