package Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
public class RemoveDuplicates {
    static int brute(int arr[]){
        Set <Integer> st=new HashSet();
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }
        int index=0;
        for(int it:st){
            arr[index]=it;
            index++;
        }
        return index;
    }
    static int optimal(int arr[]){
        if(arr.length<=1) return arr.length;
        int l=1;
        for(int r=1;r<arr.length;r++){
            if(arr[l-1]!=arr[r]){
                arr[l]=arr[r];
                l+=1; 
            } 
        }
        return l;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3};
        //System.out.println(brute(arr));
        System.out.println(optimal(arr));
    }
}
