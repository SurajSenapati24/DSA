import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={1,3,5,7,0,0,0,0};
        int m=4;
        int n=4;
        int[] nums2={2,4,6,8};
        mergeSortedArrays(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));


    }
    public static void mergeSortedArrays(int[] nums1,int m, int[] nums2,int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i-=1;
            }
            else{
                nums1[k]=nums2[j];
                j-=1;
            }
            k-=1;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j-=1;
            k-=1;
        }
    }
}
