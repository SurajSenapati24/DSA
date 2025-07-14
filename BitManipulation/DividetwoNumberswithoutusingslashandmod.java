import java.util.*;
public class DividetwoNumberswithoutusingslashandmod {
    public static int divide(int dividend, int divisor) {
        
        if(dividend==0) return 0;
        //The sign will be negative only when the sign of the dividend and divisor will be different
        int sign=((dividend<0)^(divisor<0)) ? -1 : 1;
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        int quotient=0;
        while(dividend>divisor){
            dividend-=divisor;
            ++quotient;
        }
        return sign*quotient;
    }
    public static void main(String[] args) {
        System.out.println(divide(9, 2));
    }
}
