package ArrayandStrings;
import java.util.*;
//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
//each unique element appears only once. The relative order of the elements should be kept
//the same.Then return the number of unique elements in nums.
//Consider the number of unique elements of nums to be k, to get accepted, you need to do the following
//things:
//Change the array nums such that the first k elements of nums contain the unique elements in the order they
//were present in nums initially. The remaining elements of nums are not important as well as the size
//of nums.
//Return k.
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        int expectedNums[]={0,1,2,3,4};
        int k = removeDuplicates(nums); // Calls your implementation
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        for(int i = 0; i < k; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums){
        if(nums.length<=1){
            return  nums.length;
        }
        int l=1;
        for(int r=1;r<nums.length;r++){
            if(nums[l-1]!=nums[r]){
                nums[l]=nums[r];
                l+=1;
            }
        }
        return l;
    }
}
