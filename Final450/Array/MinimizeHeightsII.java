public class MinimizeHeightsII {
    public static int solution(int arr[],int k){
        int n=arr.length;
        int min=arr[0]+k;
        int max=arr[n-1]-k;
        int diff=arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-k>=0){
                int minh=Math.min(min,arr[i]+k);
                int maxh=Math.max(max,arr[i-1]-k);
                diff=Math.min(diff,maxh-minh);
            }
        }
        return diff;
    }
}
