import java.util.*;
public class MergeOverlappingIntervals {
    public static int[][] brute(int arr[][]){
        int n=arr.length;
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0], b[0]));
        List<int []> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            int start=arr[i][0];
            int end=arr[i][1];
            if(!res.isEmpty() && res.get(res.size()-1)[1]>=end){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(arr[j][0]<=end){
                    end=Math.max(end, arr[j][1]);
                }
            }
            res.add(new int[]{start,end});
        }
        return res.toArray(new int[res.size()][]);
    }
    public static int[][] optimal(int intervals[][]){
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        LinkedList<int []> ans=new LinkedList<>();
        for(int interval[]: intervals){
            if(ans.isEmpty() || ans.getLast()[1] < interval[0]){
                ans.add(interval);
            }
            else{
                ans.getLast()[1]=Math.max(interval[1],ans.getLast()[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        int arr[][]={{1,3},{2,6},{8,10},{15,18}};
        int ans[][]=optimal(arr);
        int n=ans.length;
        for(int i=0;i<n;i++){
            System.out.print(Arrays.toString(ans[i])+" ");
        }
        System.out.println();
    }
}
