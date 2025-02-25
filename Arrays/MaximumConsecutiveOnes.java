import java.util.*;
public class MaximumConsecutiveOnes {
    public static int solution(int arr[]){
        int n=arr.length;
        int max=0;int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                max=Math.max(max, count);
            }
            else{
                count=0;
            }
        }
        /*while(i<n){
            if(arr[i]==1){
                count+=1;
                max=Math.max(max, count);
            }
            else{
                count=0;
            }
            i++;
        }*/
        return max;
        //T.C=O(n)
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,2,1,1};
        System.out.println(solution(arr));
    }
}
