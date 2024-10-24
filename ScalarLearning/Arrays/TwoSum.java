package ScalarLearning.Arrays;
import java.util.*;
public class TwoSum {
    public static int [] twoSum(int[] array,int target){
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<array.length;i++){
            int second=target-array[i];
            if(map.containsKey(second)){
                return new int[] {map.get(second),i};
            }
            map.put(array[i], i);
        }
        throw new IllegalArgumentException("No Two Sum Present.");
    }
    public static void main(String[] args) {
        int[] arr={11, 3, 7, 9, 14, 2};
        int target=17;
        int ans[]=twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
