class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        //Two Pointers
        int l=1;
        int count=1;
        //We will count the number of duplicates
        for(int r=1;r<nums.length;r++){
            if(nums[r]==nums[r-1]){
                count++;
            }
            else{
                count=1;
            }
            //if any duplicates atmost two
            if(count<=2){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;
    }
}