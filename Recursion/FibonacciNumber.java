public class FibonacciNumber {
    public static int nthfibonacci(int n){
        if(n<=1){
            return n;
        }
        int last=nthfibonacci(n-1);
        int slast=nthfibonacci(n-2);
        return last+slast;
    }
    public static void main(String[] args) {
        System.out.println(nthfibonacci(3));
    }
}
