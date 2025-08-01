public class RemoveElementsFromAnArray2 {
    public int removeDuplicates(int[] nums) {
        int l=1;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                nums[l]=nums[i];
                l++;
            }
        }
        return l;
    }
}
