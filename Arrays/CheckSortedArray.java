package Arrays;

public class CheckSortedArray {
    static boolean checkSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(!(arr[i]>=arr[i-1])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,3,4,5,6};
        System.out.println(checkSorted(a));
    }
}
