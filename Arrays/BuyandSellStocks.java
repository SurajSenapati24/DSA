public class BuyandSellStocks {
    public static int maxProfit(int prices[]){
        int profit=0;
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(minimum>prices[i]){
                minimum=prices[i];
            }
            profit=Math.max(profit,prices[i]-minimum);
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int profit=maxProfit(prices);
        System.out.println(profit);
    }
}
