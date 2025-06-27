import java.util.*;
public class HouseRobber2 {
    public static int rob(int[] nums){
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(help(nums, 0, n-2), help(nums, 1, n-1));
    }
    public static int help(int[] nums, int start, int end) {
        int p1=0,p2=0;
        for(int i=start;i<=end;i++){
            int curr=Math.max(p2, p1+nums[i]);
            p1=p2;
            p2=curr;
        }
        return p2;
    }
    public static void main(String[] args) {
        int nums[]={2,7,3,1,4,2,1,8};
        System.out.println(rob(nums));
    }
}
