import java.util.*;
public class NextPermutation {
    public static int[] optimal(int arr[]){
        int index=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            Arrays.sort(arr);
            return arr;
        }
        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }
        Arrays.sort(arr,index+1,n);
        return arr;
    }
    //using List
    public static List<Integer> optimal(List<Integer> A) {
        int index = -1;
        int n = A.size();

        // Step 1: Find the first decreasing element from the right
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                index = i;
                break;
            }
        }

        // Step 2: If no such element exists, return sorted list (smallest permutation)
        if (index == -1) {
            Collections.sort(A);
            return A;
        }

        // Step 3: Find the element just greater than arr[index] from the right
        for (int i = n - 1; i > index; i--) {
            if (A.get(i) > A.get(index)) {
                Collections.swap(A, i, index);
                break;
            }
        }

        // Step 4: Sort the part after the swapped index
        List<Integer> sublist = A.subList(index + 1, n);
        Collections.sort(sublist);

        return A;
    }
   public static void main(String[] args) {
        int arr[]={2,1,5,4,3,0,0};
        List<Integer> a=new ArrayList(Arrays.asList(3,2,1)); 
        System.out.println((optimal(a)));  
    } 
}
