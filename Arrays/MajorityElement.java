package Arrays;
import java.util.*;
public class MajorityElement {
    public static int brute(int arr[],int n){
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>(n/2)) return arr[i];    
        }
        return -1;
    }
    public static int better(int arr[],int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static int optimal(int arr[],int n){
        int count=0;
        int el=-1;
        for(int i=0;i<n;i++){
            if(count==0){
                el=arr[i];
                count=1;
            }
            else if(el==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if (arr[i]==el) {
                c++;
            }
        }
        if(c>n/2){
            return el;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,2,3,3,1,2,2};
        System.out.println("Majority Element is: "+optimal(arr, arr.length));
    }
}
