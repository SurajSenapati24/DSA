package Recursion;

public class PrintNameNTimes {
    public static void fun(int n){
        if(n<1) return;
        System.out.println("Suraj");
        fun(n-1);
    }
    public static void main(String[] args) {
        fun(5);
    }
}
