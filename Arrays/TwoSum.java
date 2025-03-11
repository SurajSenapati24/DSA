import java.util.*;
public class TwoSum {
    public static String optimal(int arr[],int target){
        int n=arr.length;
        Arrays.sort(arr);
        int i=0,j=n-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                return "YES";
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
        return "NO";
        //T.C=O(N)
    }
    public static String better(int arr[],int target){
        int n=arr.length;
        HashMap <Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int required=target-arr[i];
            if(map.containsValue(required)){
                return "YES";
            }
            else{
                map.put(i, arr[i]);
            }
        }
        return "NO";
        //T.C=O(N)
        //S.C=O(N)
    }

    public static void main(String[] args) {
        int arr[]={4,1,2,3,1};
        int target=5;
        System.out.println(better(arr, target));
    }
}
