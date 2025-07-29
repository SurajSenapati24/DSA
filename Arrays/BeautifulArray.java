/*Check if arr[i] is divisible by arr[2*i+1] and arr[2*i+2]
 * if for every indices in the array if this case satisfies then return 1 else 0
 */
public class BeautifulArray {
    public static int solution(int n,int arr[]){
        int ans=0;
        for(int i=0;i<n/2-1;i++){
            if(arr[i]%arr[2*i+1]==0 && arr[i]%arr[2*i+2]==0){
                ans=1;
            }
            else{
                ans=0;
            }
        }
        return ans; 
    }
    public static void main(String[] args) {
        int arr[]={4,2,1,1};
        int n=arr.length;
        System.out.println(solution(n, arr));
    }
}
