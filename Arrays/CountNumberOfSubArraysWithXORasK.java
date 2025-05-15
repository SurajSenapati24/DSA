import java.util.*;
public class CountNumberOfSubArraysWithXORasK {
    public static int optimal(int arr[], int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0, count = 0;
        map.put(0, 1);
        for (int num : arr) {
            xor ^= num;
            if (map.containsKey(xor ^ K)) {
                count += map.get(xor ^ K);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
        // Time Complexity: O(n)
    }
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
        System.out.println(optimal(arr, k));
    }
}
