public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxx=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxx) return false;
            maxx=Math.max(maxx, i+nums[i]);
        }
        return true;
    }
}
