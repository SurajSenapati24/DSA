public class TrappingRainwater {
    public static int optimal(int arr[]){
        int leftmax=Integer.MIN_VALUE,rightmax=Integer.MIN_VALUE;
        int left=0,right=arr.length-1;
        int total=0;
        while(left<right){
            if(leftmax<=rightmax){
                if(leftmax>arr[left]){
                total+=leftmax-arr[left];
                }
                else{
                    leftmax=arr[left];
                }
                left++;
            }
            else{
                if(rightmax>arr[right]){
                    total+=rightmax-arr[right];
                }
                else{
                    rightmax=arr[right];
                }
                right--;
            } 
        }
        return total;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(optimal(arr));
    }
}
