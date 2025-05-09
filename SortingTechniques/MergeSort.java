package SortingTechniques;
import java.util.*;
public class MergeSort {
    static void merge(int arr[], int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (i = 0; i < n1; i++) {
            L[i] = arr[l + i]; 
        }
        for (j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        i = 0; j = 0; k = l; 
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
    static void mergeSort(int arr[], int l, int r) {
        int m;
        if (l < r) {
            m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    public static void main(String[] args) {
        int arr[] = {99, 2, 34, 1, 46, 8, 4};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}