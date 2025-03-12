import java.util.*;
public class LongestConsecutiveSrquence {
    public static boolean linearSearch(int arr[],int key){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
    public static int brute(int arr[]){
        int n=arr.length;
        int max=1;
        for(int i=0;i<n;i++){
            int count=1;
            int x=arr[i];
            while(linearSearch(arr,x+1)==true){
                x+=1;
                count+=1;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
        //T.C=O(N^2)
    }
    public static int better(int arr[]){
        int n=arr.length;
        int lastsmall=Integer.MIN_VALUE;
        int curr=0;
        int longest=1;
        Arrays.sort(arr);//Dual Pivot Quicksort //O(N)
        for(int i=0;i<n;i++){
            if(arr[i]-1==lastsmall){
                curr+=1;
                lastsmall=arr[i];
            }
            else if(arr[i]!=lastsmall){
                curr=1;
                lastsmall=arr[i];
            }
            longest=curr>longest ? curr:longest;
        }
        return longest;
        //O(N+N)
    }
    public static int optimal(int arr[]){
        Set <Integer> st=new HashSet<>();
        for(int i:arr){
            st.add(i);
        }
        int longest=1;
        int count=0;
        for(int i:arr){
            if(!st.contains(i-1)){
                count=1;
                int x=i;
                while(st.contains(x+1)){
                    x+=1;
                    count+=1;
                }
            }
            longest=Integer.max(longest,count);
        }
        return longest;
        //T.C=O(3N)=O(N)
        //S.C=O(N)
    }
    public static void main(String[] args) {
        int arr[]={102,4,100,1,101,3,2,1,1};
        System.out.println(optimal(arr));
    }
}
