public class HouseRobber {
    public static int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int total[]=new int[n];
        total[0]=nums[0];
        total[1]=Math.max(nums[1],nums[0]);
        for(int i=2;i<n;i++){
            total[i]=Math.max(total[i-2]+nums[i],total[i-1]);
        }
        return total[n-1];
    }
    public static void main(String[] args) {
        int nums[]={2,7,3,1,4,2,1,8};
        System.out.println(rob(nums));
    }
}
