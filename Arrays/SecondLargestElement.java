package Arrays;

import java.util.Arrays;

public class SecondLargestElement {
    static int brute(int arr[]){
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        int sec_largest=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<largest){
                sec_largest=arr[i];
                break;
            }
        }
        return sec_largest;

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        System.out.println(brute(arr));
    }
}
