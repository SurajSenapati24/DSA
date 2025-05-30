package ArrayandStrings;
//Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that
//each unique element appears at most twice. The relative order of the elements should be kept the same.
//Since it is impossible to change the length of the array in some languages, you must instead have the
//result be placed in the first part of the array nums. More formally, if there are k elements after
//removing the duplicates, then the first k elements of nums should hold the final result. It does not
//matter what you leave beyond the first k elements.
//Return k after placing the final result in the first k slots of nums.
import java.util.*;
public class RemoveElementsFromSortedArrayII {
    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,3};
        int expectedNums[]={1,1,2,2,3};
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
        int l=1;
        int count=1;
        for(int r=1;r<nums.length;r++){
            if(nums[r]==nums[r-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;
    }
}
