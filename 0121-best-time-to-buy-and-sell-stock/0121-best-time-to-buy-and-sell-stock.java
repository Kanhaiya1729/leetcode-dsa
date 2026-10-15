class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0];
        int maxProfit=0;
        for(int i=0;i<n;i++){
            int profit=prices[i]-min;
            maxProfit=Math.max(profit,maxProfit);
            if(prices[i]<min){
                min=prices[i];
            }

        }
        return maxProfit;

        
    }
}