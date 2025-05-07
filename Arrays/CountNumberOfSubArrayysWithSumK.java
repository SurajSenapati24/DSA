import java.util.*;

public class CountNumberOfSubArrayysWithSumK {
    public static int brute(int arr[], int K) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == K)
                    count++;
            }
        }
        return count;
        // T.C=O(N^3)
    }

    public static int better(int arr[], int K) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == K)
                    count++;
            }
        }
        return count;
        // T.C=O(N^2)
    }

    public static int optimal(int arr[], int K) {
        int count = 0;
        int preSum = 0;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            int remove = preSum - K;
            count += map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
        //T.C=O(N)
    }
    

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int k = 3;
        System.out.println(optimal(arr, k));
    }
}
