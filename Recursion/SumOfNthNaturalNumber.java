package Recursion;
import java.util.*;
public class SumOfNthNaturalNumber {
    //parameterized way
    public static void parameterizedWaySum(int n,int sum){
        if(1>n){
            System.out.println(sum); 
            return;
        }
        parameterizedWaySum(n-1,sum+n);
    }
    //functional way
    public static int functionalWaySum(int n){
        if(n==0){
            return 0;
        }
        return n+functionalWaySum(n-1);
    }
    public static void main(String[] args) {
        parameterizedWaySum(5, 0);
        System.out.println(functionalWaySum(4));
    }
}
