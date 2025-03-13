import java.util.*;
public class CountEvenAndOddNumberOfOccurences {
    public static int[] optimal(int arr[],int n){
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1 );
            }
            else{
                map.put(arr[i],1);
            }
        }
        int even=0,odd=0;
        int ans[]=new int[2];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()%2==0) even++;
            else odd++;
        }
        ans[0]=odd;
        ans[1]=even;
        return ans;
        //T.C=O(n+n)
        //S.C=O(n)
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,1,2,4};
        System.out.println(Arrays.toString(optimal(arr, arr.length)));
    }
}
