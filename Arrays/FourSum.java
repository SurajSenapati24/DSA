import java.util.*;
public class FourSum {
    public static List<List<Integer>> brute(int arr[], int target){
        int n=arr.length;
        Set<List<Integer>> st=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        long sum=arr[i]+arr[j];
                        sum+=arr[k];
                        sum+=arr[l];
                        if(sum==target){
                            List<Integer> temp=new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                            st.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(st);
        return ans;
    }
    public static List<List<Integer>> better(int arr[], int target){
        int n=arr.length;
        Set<List<Integer>> st=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> hashset=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum=arr[i]+arr[j];
                    sum+=arr[k];
                    long fourth=target-(sum);
                    if(hashset.contains(fourth)){
                        List<Integer> temp=new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k],(int)fourth));
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    hashset.add((long)arr[k]);
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(st);
        return ans;
    }
    public static List<List<Integer>> optimal(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=nums[i]+nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum>target) l--;
                    else if(sum<target) k++;
                    else{
                        List<Integer> temp=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,0,-1,0,-2,2};
        int target=0;
        System.out.println(better(arr, target));   
    }
}
