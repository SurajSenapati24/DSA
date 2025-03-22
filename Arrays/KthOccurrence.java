import java.util.*;
/*
 There is an array of integers, arr, and an integer value X. For each element in another array of integers, query_values return 
 the 1-based index in arr of the query_values[i] occurrence of X. if X does not occur query_Values[i]times, return -1 for that 
 query
 */
public class KthOccurrence {
    public static List<Integer> solution(int []arr,int x, int []query_values){
        ArrayList<Integer> occ=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                occ.add(i+1);
            }
        }
        for(int q:query_values){
            if(q<=occ.size()){
                res.add(occ.get(q-1));
            }
            else{
                res.add(-1);
            }
        }
        return res;
    } 
    public static void main(String[] args) {
        int  arr[]={1,2,20,8,8,1,2,5,8,0};
        int query_values[]={100,4,2};
        int x=8;
        System.out.println(solution(arr, x, query_values));
    }
}
