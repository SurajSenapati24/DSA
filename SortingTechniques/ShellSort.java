package SortingTechniques;
import java.util.*;
public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform a gapped insertion sort
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                // Shift elements of arr[0..i-gap] that are greater than temp
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                // Place temp at the correct position
                arr[j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {99, 2, 34, 1, 46, 8, 4};
        shellSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
