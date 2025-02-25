import java.util.Arrays;

public class SecondLargestElement {
    static int LargestElement(int arr[]){
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
        //T.C= O(nlogn+n)
    }
    static int better(int arr[]){
        int largest=LargestElement(arr);
        int second_largest=-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>second_largest && arr[i]!=largest){
                second_largest=arr[i];
            }
        }
        return second_largest;
        //T.C=O(n+n)=O(2n) approximately =O(n)
    }
    static int optimal(int arr[]){
        int largest=arr[0];
        int sec_largest=-1;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>largest){
                sec_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>sec_largest){
                sec_largest=arr[i];
            }
        }
        return sec_largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        System.out.println(brute(arr));
        System.out.println(better(arr));
        System.out.println(optimal(arr));
    }
}
