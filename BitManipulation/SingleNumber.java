public class SingleNumber {
    public static int soltuion(int arr[]){
        int xor=arr[0];
        for(int i=1;i<arr.length;i++){
            xor^=arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        System.out.println(soltuion(arr));
    }
}
