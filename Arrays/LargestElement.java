package Arrays;
import java.util.Arrays;
public class LargestElement {

    static int brute(int arr[]){
        if(arr.length==0){
            return -1;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
        //T.C: O(nlogn) 
    }
    static int optimal(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,5,2};
        System.out.println(brute(arr));
        System.out.println(optimal(arr));
    }
}
