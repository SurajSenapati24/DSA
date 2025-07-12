public class CheckIfTheNumberIsPowerOf2 {
    public static boolean soltuion(int n){
        if(n<=0) return false;
        return (n & (n-1)) ==0;
    }
    public static void main(String[] args) {
        System.out.println(soltuion(2));
    }
}
