public class RotateImageby90degrees {
    public static int[][] brute(int arr[][]){
        int n=arr.length;
        int [][] ans=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][(n-1)-i]=arr[i][j];
            }
        }
        return ans;
    }
    public static int[][] optimal(int arr[][]){
        int n=arr.length;
        transpose(arr);
        for(int i=0;i<n;i++){
            reverseRow(arr, i, 0, n-1);
        }
        return arr;
    }
    public static void reverseRow(int arr[][], int i, int start, int end){
        while(start<=end){
            int temp=arr[i][start];
            arr[i][start]=arr[i][end];
            arr[i][end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int arr[][]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int arr[][]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printArray(arr);
        int ans[][]=brute(arr);
        printArray(ans);
        System.out.println("Optimal Solution Results: ");
        optimal(arr);
        printArray(arr);

    }
}
