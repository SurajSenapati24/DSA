import java.util.*;
public class LemonadeChange {
    public static boolean solution(int arr[]){
        int five=0,ten=0;
        for(int bill:arr){
            if(bill==5) five++;
            else if(bill==10){
                if(five!=0){
                    five--;
                    ten++;
                }
                else return false;
            }
            else{
                if(five!=0 && ten!=0){
                    five--;
                    ten--;
                }
                else if(five>=3) five-=3;
                else return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={5,5,5,10,20};
        System.out.println(solution(arr));
    }
}
