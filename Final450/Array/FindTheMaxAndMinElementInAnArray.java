public class FindTheMaxAndMinElementInAnArray {
    public static void soltuion(int arr[]){
        int minimum=Integer.MAX_VALUE;
        int maximum=Integer.MIN_VALUE;
        for(int i : arr){
            if(i>maximum){
                maximum=i;
            }
            if(i<minimum){
                minimum=i;
            }
        }
    }
}
