package Arrays;
import java.util.*;
public class MoveAllTheZerosToTheEnd {
    public static int [] brute(int[] arr){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        for(int i=0;i<temp.size();i++){
            arr[i]=temp.get(i);
        }
        for(int i=temp.size();i<arr.length;i++){
            arr[i]=0;
        }
        return arr;
    }
    public static int [] optimal(int[] arr){
        int n=arr.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[j]==0){
                if(arr[i]!=0){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }else{
                    continue;
                }
            }
            j++;
        }
        return arr;
    }
    public static void main(String[] args) {
        //Use case for optimal
        int arr[]={1,0,8,0,7,0,0,3,4,10};
        //System.out.println(Arrays.toString(brute(arr)));
        System.out.println(Arrays.toString(optimal(arr)));
    }
}
