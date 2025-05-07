import  java.util.*;
public class CountNumberOfSubArrayysWithSumK {
    public static int brute(int arr[], int K){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==K) count++;
            }
        }
        return count;
    }
    public static int better(int arr[], int K){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==K) count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
        System.out.println(better(arr, k));
    }
}
