package Arrays;
import java.util.*;
public class RotateLeftBydelement {
    static int[] brute(int arr[],int d){
        int temp[]=new int[d];
        int n=arr.length;
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
        return arr;
    }
    //Here is the optimal solution with T.C=O(2n) but S.C=O(1)
    static void reverse(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static int []optimal(int arr[],int d){
        int n=arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        //System.out.println(Arrays.toString(brute(arr, 2)));
        System.out.println(Arrays.toString(optimal(arr, 2)));
    }
}