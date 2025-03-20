import java.util.*;
public class MagicIndex {
    public static int solution(int arr[],int n){
        for(int i=0;i<n;i++){
            if(arr[i]==i){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={9,7,5,3,7,2,0};
        int n=arr.length;
        System.out.println(solution(arr, n));
    }
}
