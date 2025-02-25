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
    public static int [] optimal(int[] a){
        int j = 0;
        int n=a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                if (i != j) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
                j++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        //Use case for optimal
        int arr[]={1,0,8,0,7,0,0,3,4,10};
        //System.out.println(Arrays.toString(brute(arr)));
        System.out.println(Arrays.toString(optimal(arr)));
    }
}
