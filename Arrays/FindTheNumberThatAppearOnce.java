import java.util.*;
public class FindTheNumberThatAppearOnce {
    public static int brute(int arr[]){
        int n=arr.length;
        int ans=-1,num=0;
        for(int i=0;i<n;i++){
            num=arr[i];
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==num) count++; 
            } if(count==1){
                ans=arr[i];
                break; 
            }
        }
        //T.C=O(n*n)
        return ans;
    }
    public static int better(int arr[]){
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hash.containsKey(arr[i])){
                hash.put(arr[i], hash.get(arr[i])+1);
            }else{
                hash.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:hash.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
        //T.C=O(n+n)
        //S.C=O(length(set(arr)))
    }
    public static int optimal(int arr[]){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int a[]={1,1,2,3,3,4,4};
        System.out.println(optimal(a));
    }
}
