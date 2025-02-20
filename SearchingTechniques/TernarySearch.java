public class TernarySearch {
    public static int ternarySearch(int arr[],int l,int r, int key){
        if(r>=l){
            int mid1=l+(r-l)/3;
            int mid2=r-(r-l)/3;
            if(key==arr[mid1]) return mid1;
            if(key==arr[mid2]) return mid2;
            if(key<arr[mid1]){
                return ternarySearch(arr, mid1-1, r, key);
            }
            else if(key>arr[mid2]){
                return ternarySearch(arr, mid2+1, r, key);
            }
            else{
                return ternarySearch(arr, mid1+1, mid2-1, key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=6;
        System.out.println(ternarySearch(arr, 0, arr.length-1, key));
    }
}
