import java.util.*;
public class MaximumSubarraySum {
    public static int brute(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    max=Math.max(max, sum);
                }
            }
        }
        return max;
        //T.C=O(N^3)
    }
    public static int better(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                max=Math.max(max, sum);
            }
        }
        return max;
        //T.C=O(N^2) 
    }
    public static int optimal(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        // int start=0,end=0,ansstart=0;
        //comments for printing subarray
        for(int i=0;i<n;i++){
            // if(sum==0) start=i;
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>max){
                max=sum;
                // ansstart=start;
                // end=i;
            }
        }
        return max;
    }
    //for negative sum as well
    public static int leetcode(int arr[]){
        int sum=0;
        int max=0;
        for(int num:arr){
            if(sum<0) sum=0;
            sum+=num;
            max=sum > max? sum:max;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(leetcode(arr));
    }
}
