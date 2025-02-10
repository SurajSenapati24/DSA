package Arrays;
import java.util.*;
public class LongestSubarrayWithGivenSum {
    public static int brute(int arr[],long k){
        int n=arr.length;
        int len=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int a=i;a<=j;a++){
                    sum+=arr[a]; 
                }
                if(sum==k){
                    len=Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    public static int optimizedBrute(int[] arr,int k){
        int len=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k) len=Math.max(len, j-i+1);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,2,4,2,1};
        int k=3;
        System.out.println(optimizedBrute(arr, k));
    }
}
