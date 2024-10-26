package ArrayandStrings;
//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        rotateArray(nums,k);
        for(int num: nums){
            System.out.print(num+" ");
        }
    }
    public static void rotateArray(int nums[],int k){
        int n=nums.length;
        if(k>n){
            k=k%n;
        }
        //reverse the whole array
        reverse(nums,0,n-1);
        //reverse the first k elements
        reverse(nums,0,k-1);
        //reverse the remaining elements
        reverse(nums,k,n-1);
    }
    public static void reverse(int nums[], int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
