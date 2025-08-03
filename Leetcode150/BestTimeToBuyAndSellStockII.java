public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int start=prices[0];
        int maxx=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>start) maxx+=prices[i]-start;
            start=prices[i];
        }
        return maxx;
    }
}
