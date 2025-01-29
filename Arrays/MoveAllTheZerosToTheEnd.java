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
    public static void main(String[] args) {
        int arr[]={1,0,1,0,2,0,0,3,4,0};
        System.out.println(Arrays.toString(brute(arr)));
    }
}
