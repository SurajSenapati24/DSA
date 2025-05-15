import java.util.*;
public class CountNumberOfSubArraysWithXORasK {
    public static int brute(int arr[], int K){
        int  n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int xor=0;
                for(int k=i;k<=j;k++){
                    xor=xor^arr[k];
                }
                if(xor==K) count++;
            }
        }
        return count;
        //T.C= approx. O(n^3)
    }
    public static int better(int arr[], int K){
        int  n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int xor=0;
            for(int j=i;j<n;j++){
                xor^=arr[j];
                if(xor==K) count++; 
            }
        }
        return count;
        //T.C= O(n^3)
    }
    public static void main(String[] args) {
        int arr[]={4,2,2,6,4};
        int k=6;
        System.out.println(better(arr, k));
    }
}
