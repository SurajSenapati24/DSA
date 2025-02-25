import java.util.*;
public class IntersectionOfTwoSortedArrays {
    public static List<Integer> brute(int a[],int b[]){
        int n1=a.length;
        int n2=b.length;
        List <Integer> ans=new ArrayList<>();
        int visited[]=new int[n2];
        Arrays.fill(visited,0);
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a[i]==b[j] && visited[j]==0){
                    ans.add(a[i]);
                    visited[j]=1;
                    break;
                }
            }
        }
        
        return ans;
    }
    public static List<Integer> optimal(int a[],int b[]){
        int n=a.length;
        int m=b.length;
        int i=0,j=0;
        List <Integer> ans=new ArrayList<>();
        while(i<n && j<m){
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={1,2,2,2,3,4};
        int b[]={2,2,3,3};
        System.out.println(optimal(a, b));
    }
}
