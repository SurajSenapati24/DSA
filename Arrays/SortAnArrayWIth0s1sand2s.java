package Arrays;
import java.util.*;
public class SortAnArrayWIth0s1sand2s {
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void brute(int arr[]){
        Arrays.sort(arr);
    }
    static void better(int arr[]){
        int n=arr.length;
        int c0=0,c1=0,c2=0;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==0) c0++;
            else if(arr[i]==1) c1++;
            else c2++;
        }
        for(i=0;i<c0;i++) arr[i]=0;
        for(i=c0;i<c1;i++) arr[i]=1;
        for(i=c0+c1;i<n;i++) arr[i]=2;
    }
    static void optimal(int arr[]){
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){ 
                swap(arr, low, mid );
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            } 
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,2,0,1,1,2,0,1,0};
        // brute(arr);
        // better(arr);
        optimal(arr);
        System.out.println("Sorted array is: "+Arrays.toString(arr));
    }
}
