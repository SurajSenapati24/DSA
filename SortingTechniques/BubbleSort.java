package SortingTechniques;
import java.util.*;
public class BubbleSort {
    static void bubbleSort(int arr[]){
        int n=arr.length;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }    
    }
    public static void main(String[] args) {
        int arr[]={3,1,7,11,99,2};
        bubbleSort(arr);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }
}
