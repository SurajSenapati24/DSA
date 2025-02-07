package SortingTechniques;
import java.util.*;
public class InsertionSort {
    public static void insertionSort(int arr[],int n){
        int key,i,j;
        for(i=1;i<n;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,6,4,9,7};
        int n=arr.length;
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        insertionSort(arr, n);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }
}