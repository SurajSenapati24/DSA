package SortingTechniques;
import java.util.*;
public class SelectionSort {
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minidx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {99, 2, 34, 1, 46, 8, 4};
        selectionSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }    
}
