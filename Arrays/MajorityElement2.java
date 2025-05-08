import java.util.*;
public class MajorityElement2 {
    public static List<Integer> brute(int arr[]){
        List<Integer> lst=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(lst.size()==0 || lst.get(0)!=arr[i]){
                int count=0;
                for(int j=0;j<n;j++){
                    if(arr[j]==arr[i]) count++;
                }
                if(count>n/3) lst.add(arr[i]);
            }
            if(lst.size()==2) break;
        }
        return lst;
        //T.C=O(N^2)
    }
    public static List<Integer> better(int arr[]){
        List<Integer> ans=new ArrayList<>();
        int n=arr.length, min=n/3+1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if(map.get(arr[i])==min){
                ans.add(arr[i]);
            }
            if(ans.size()==2) break;
        }
        return ans;
        //T.C=O(N) S.C=O(N)
    }
    public static List<Integer> optimal(int arr[]){
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        int c1=0,c2=0,el1=0,el2=0;
        for(int i=0;i<n;i++){
            if(c1==0 && arr[i]!=el2){
                c1=1;
                el1=arr[i];
            }
            else if(c2==0 && arr[i]!=el1){
                c2=1;
                el2=arr[i];
            }
            else if(arr[i]==el1) c1++;
            else if(arr[i]==el2) c2++;
            else{
                c1--;
                c2--;
            }
        }
        c1=0;c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==el1) c1++;
            else if(arr[i]==el2) c2++;
        }
        if(c1>n/3) ans.add(el1);
        if(c2>n/3) ans.add(el2);
        return ans;

    }
    public static void main(String[] args) {
        int arr[]={1,1,1,3,3,2,2,2};
        System.out.println(brute(arr));
        System.out.println(better(arr));
        System.out.println(optimal(arr));
    }
}
