public class KadanesAlgorithm {
    public static int solution(int arr[]){
        int sum=0,max=Integer.MIN_VALUE;
        for(int i:arr){
            if(sum<0) sum=0;
            sum+=i;
            max=Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,-1,2,4,2};
        System.out.println(solution(arr));
    }
}
