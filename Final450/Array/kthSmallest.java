import java.util.PriorityQueue;

public class kthSmallest {
    public static int soltuion(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i : arr){
            pq.offer(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
