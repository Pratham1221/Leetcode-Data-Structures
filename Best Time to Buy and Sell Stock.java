class Solution {
    public int maxProfit(int[] prices) {
        // int maxprofit = 0;
        // for(int i =0;i<prices.length;i++){
        //     for(int j = i+1;j<prices.length;j++){
        //         int profit = prices[j]-prices[i];
        //         if (profit > maxprofit){
        //             maxprofit = profit;
        //         }
        //     }
        // }
        // return maxprofit;
        // int maxProfit = 0;
        // int minPrice = prices[0];
        // for(int i = 1;i<prices.length;i++){
        //     maxProfit = Math.max(maxProfit,prices[i]-minPrice);
        //     minPrice = Math.min(prices[i],minPrice);
        // }
        // return maxProfit;
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while(right<prices.length){
            int profit = prices[right] - prices[left];
            if(profit > maxProfit){
                maxProfit = profit;
            }
            if (prices[left]>prices[right]){
                left = right;
            }
            right++;
        }
        return maxProfit;
        // int left = 0;
        // int maxProfit = 0;
        // int right = 1;
        // while (right<prices.length){
        //     if (prices[left]<prices[right]){
        //         int profit = prices[right]-prices[left];
        //         maxProfit = Math.max(profit,maxProfit);
        //     }else{
        //         left=right;
        //     }
        //     right++;
        // }
        // return maxProfit;
    }
}
