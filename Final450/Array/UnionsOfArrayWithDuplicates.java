import java.util.ArrayList;
import java.util.HashSet;

public class UnionsOfArrayWithDuplicates {
    public static ArrayList<Integer> solution(int a[],int b[]){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i:a){
            set.add(i);
        }
        for(int j:b){
            set.add(j);
        }
        for(int i:set){
            ans.add(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={1, 2, 3, 2, 1};
        int b[]={3, 2, 2, 3, 3, 2};
        System.out.println(solution(a, b).toString());
    }
}
