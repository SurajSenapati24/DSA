import java.util.*;
public class ThreeSum {
    public static List<List<Integer>> brute(int nums[]){
        int n=nums.length;
        Set<List<Integer>> st= new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> t:st){
            ans.add(t);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        System.out.println(brute(nums));
    }
}
