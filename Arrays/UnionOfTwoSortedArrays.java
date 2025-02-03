package Arrays;
import java.util.*;
public class UnionOfTwoSortedArrays {
    public static List<Integer> brute(int a[],int b[]){
        Set<Integer> s=new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            s.add(b[i]);
        }
        List <Integer> ans=new ArrayList<>();
        for(int i:s){
            ans.add(i);
        }
        return ans;
    }
    public static List<Integer> optimal(int a[],int b[]){
        int n=a.length;
        int m=b.length;
        List <Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                if(!ans.contains(a[i])){
                    ans.add(a[i]);
                }
                i++;
            }
            else{
                if(!ans.contains(b[j])){
                    ans.add(b[j]);
                }
                j++;
            }
        }
        while(i<n){
            if(!ans.contains(a[i])){
                ans.add(a[i]);
            }
            i++;
        }
        while(j<m){
            if(!ans.contains(b[j])){
                ans.add(b[j]);
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,6};
        int b[]={2,3,4,5};
        // System.out.println(brute(a,b));
        System.out.println(optimal(a,b));
    }
}
