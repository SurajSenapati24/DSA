public class RemoveElementsFromAnArray {
    public int removeDuplicates1(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int slow=0;
        for(int fast=1;fast<nums.length;fast++){
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int l=1;
        for(int r=1;r<nums.length;r++){
            if(nums[l-1]!=nums[r]){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;
    }
