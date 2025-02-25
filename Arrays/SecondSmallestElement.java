public class SecondSmallestElement {
    static int optimal(int arr[]){
        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<ssmallest){
                ssmallest=arr[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {
        int arr[]={7,2,4,5,1};
        System.out.println(optimal(arr));
    }
}
