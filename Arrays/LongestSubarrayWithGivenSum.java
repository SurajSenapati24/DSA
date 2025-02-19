package Arrays;
import java.util.*;

public class LongestSubarrayWithGivenSum {
    
    // Brute Force: O(n^3)
    public static int brute(int arr[], long k) {
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int a = i; a <= j; a++) {
                    sum += arr[a];
                }
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
    
    // Optimized Brute Force: O(n^2)
    public static int optimizedBrute(int[] arr, int k) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }
    
    // Optimal Approach: HashMap (O(n))
    public static int optimal(int[] arr, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0, maxLength = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if (sum == k) {
                maxLength = i + 1;
            }
            
            if (prefixSumMap.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(sum - k));
            }
            
            // Store the first occurrence of the sum
            if (!prefixSumMap.containsKey(sum)) {
                prefixSumMap.put(sum, i);
            }
        }
        
        return maxLength;
    }
    public static int slidingWindow(int[] arr, int k) {
        int left = 0, sum = 0, maxLength = 0;
    
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
    
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
    
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }
    
        return maxLength;
    }
    
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 1, 2, 4, 2, 1};
        int k = 3;
        
        System.out.println("Brute Force: " + brute(arr, k));
        System.out.println("Optimized Brute Force: " + optimizedBrute(arr, k));
        System.out.println("Optimal Solution: " + optimal(arr, k));
        System.out.println("Sliding window solution: "+slidingWindow(arr, k));
    }
}
