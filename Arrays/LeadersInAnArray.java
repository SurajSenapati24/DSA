import java.util.*;
public class LeadersInAnArray {
    public static List<Integer> brute(int arr[]){
        int n=arr.length;
        List<Integer> leaders=new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean flag=true;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    continue;
                }
                else{
                    flag=false;
                }
            }
            if(flag==true){
                leaders.add(arr[i]);
            }
        }
        return leaders;
        //T.C=O(N*N)
        //S.C=(N)
    }
    public static List<Integer> optimal(int arr[]){
        int n=arr.length;
        List<Integer> leaders=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                leaders.add(arr[i]);
                max=arr[i];
            }
        }
        return leaders;
        //T.C=O(N)
        //S.C=O(N)
    }
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        System.out.println(optimal(arr));
    }
}
