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
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> i: st){
            ans.add(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,0,-1,0,-2,2};
        int target=0;
        System.out.println(brute(arr, target));   
    }
}
