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
    public static List<List<Integer>> better(int nums[]){
        int n=nums.length;
        Set<List<Integer>> st=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> temp=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int k=-(nums[i]+nums[j]);
                if(temp.contains(k)){
                    List<Integer> subans=new ArrayList<>();
                    subans.add(nums[i]);
                    subans.add(nums[j]);
                    subans.add(k);
                    Collections.sort(subans);
                    st.add(subans);
                }
                else{
                    temp.add(nums[j]);
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> i : st){
            ans.add(i);
        }
        return ans;
        //T.C=O(N^2)
    }
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        System.out.println(better(nums));
    }
}
