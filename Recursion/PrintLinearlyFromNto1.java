public class PrintLinearlyFromNto1 {
    public static void print_Nto1(int n){
        if(1>n) return;
        System.out.print(n+" ");
        print_Nto1(n-1);
    }
    public static void main(String[] args) {
        print_Nto1(5);
    }
}
