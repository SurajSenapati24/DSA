import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
public class NextGreaterElement1 {
    public static int[] optimal(int nums1[],int nums2[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            int curr=nums2[i];
            while (!st.isEmpty() && st.peek()<=curr) {
                st.pop();
            }
            map.put(curr, st.isEmpty() ? -1:st.peek());
            st.push(curr);
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums1[]={4,1,2};
        int nums2[]={1,3,4,2};
        System.out.println(Arrays.toString(optimal(nums1, nums2)));
    }
}
