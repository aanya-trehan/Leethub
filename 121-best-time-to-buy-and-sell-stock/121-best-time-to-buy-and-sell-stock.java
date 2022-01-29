class Solution {
    public int maxProfit(int[] prices) {
        int min=0;
        int max=0;
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[min]){
                min=i;
            }
            else if(prices[i]>=prices[max]){
                max=i;
            }
            if(max<min){
                max=min+1;
            }
            if(prices[i+1]>prices[max]){
                max=i+1;
            }
            profit=Math.max(profit,prices[max]-prices[min]);
              
        }
        //System.out.println(min);
        //System.out.println(max);
        int out=prices[max]-prices[min];
        return profit;
    }
}