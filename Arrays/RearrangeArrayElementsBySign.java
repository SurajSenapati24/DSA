import java.util.*;
public class RearrangeArrayElementsBySign {
    public static int[] brute(int arr[],int n){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        int pi=0,ni=0,i=0;
        while(pi<pos.size()&& ni<neg.size()){
            if(i%2==0){
                arr[i++]=pos.get(pi++);
            }
            else{
                arr[i++]=neg.get(ni++);
            }
        }
        return arr;
    }
    public static int[] optimal(int arr[],int n){
        int ans[]=new int[n];
        int i=0,ni=1,pi=0;
        while(i<n){
            if(arr[i]>0){
                ans[pi]=arr[i++];
                pi+=2;
            }
            else{
                ans[ni]=arr[i++];
                ni+=2;
            }
        }
        /*for(int num:arr){
            if(num>0){
                ans[pi]=num;
                pi+=2;
            }
            else{
                ans[ni]=num;
                ni+=2;
            }
        } */
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(optimal(arr, arr.length)));
    }
}
