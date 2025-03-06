import java.util.*;
public class NextPermutation {
    public static int[] optimal(int arr[]){
        int index=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            Arrays.sort(arr);
            return arr;
        }
        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }
        Arrays.sort(arr,index+1,n);
        return arr;
    }
   public static void main(String[] args) {
        int arr[]={2,1,5,4,3,0,0};
        System.out.println(Arrays.toString(optimal(arr)));  
    } 
}
