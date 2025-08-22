import java.util.LinkedList;
import java.util.Queue;

public class MoveAllTheNegativeNumberstoTheEnd {
    //without changing the order of positive and negative numbers move all negative numbers to the end.
    public static void solution(int arr[]){
        Queue<Integer> map=new LinkedList<>();
        for(int i:arr){
            if(i>=0) map.add(i);
        }
        for(int i:arr){
            if(i<0) map.add(i);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.poll();
        }
    }
    //without keeping the order preserved
    public static void variant2(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                if(i!=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={-1,2,-3,4,5,-6,7,-8,9};
        variant2(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
