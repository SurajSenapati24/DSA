import java.util.*;
public class StockBuyAndSell {
    public static int brute(int prices[]){
        int profit=0;
        int n=prices.length;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                profit=Math.max(profit,prices[j]-prices[i]);
            }
        }
        return profit;
        //T.C=O(N^2)
    }
    public static int optimal(int prices[]){
        int n=prices.length;
        int min=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
            int cur=prices[i];
            if(min<cur){
                profit=Math.max(profit,cur-min);
            }
            else{
                min=cur;
            }
        }
        return profit;
        //T.C=O(N)
    }
    public static void main(String[] args) {
        int prices[]={17,20,11,9,12,6};
        System.out.println(brute(prices));
    } 
}
