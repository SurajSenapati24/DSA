public class LinearSearch {
    public static int linearSearch(int arr[], int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,1,5,2,7,8,0};
        int num=0;
        System.out.println("The element "+num+" is at index: "+linearSearch(arr, num));
    }
}
