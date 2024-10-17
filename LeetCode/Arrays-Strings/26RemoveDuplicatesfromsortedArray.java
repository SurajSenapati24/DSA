class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        //We will check the elements in the array after fixing the first element in it.
        //Two Pointers
        int l=1;
        for(int r=1;r<nums.length;r++){
            if(nums[l-1]!=nums[r]){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;
    }
}