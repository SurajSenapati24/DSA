public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit=0;
        if(prices.length<=1) return 0;
        int minimum=prices[0];
        for(int i=1;i<prices.length;i++){
            int curr=prices[i];
            if(minimum<curr){
                profit=Math.max(profit,curr-minimum);
            }
            else{
                minimum=curr;
            }
        }
        return profit;
        // My solution
    //     int profit=0;
    //     int i=0;
    //     int j=1;
    //     while(i<prices.length && j<prices.length){
    //         if(prices[j]>prices[i]){
    //             profit=Math.max(profit,prices[j]-prices[i]);
    //             j++;
    //         }
    //         else{
    //             i++;
    //             j=i+1;
    //         }
    //     }
    //     return profit;
     }
    
}
