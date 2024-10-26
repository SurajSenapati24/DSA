package ArrayandStrings;
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the
//majority element always exists in the array.
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2,};
        int ans=majorityElement(nums);
        System.out.println(ans);
    }
    public static int majorityElement(int[] nums){
        int count=0;int candidate=0;
        for(int num: nums){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
