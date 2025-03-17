package Recursion;

public class PrintLinearlyFrom1toN {
    public static void print_1toN(int n){
        if(1>n) return;
        print_1toN(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String[] args) {
        print_1toN(5);
    }
}
