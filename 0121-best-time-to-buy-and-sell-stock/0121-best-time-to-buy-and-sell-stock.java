class Solution {
    public int maxProfit(int[] prices) {
        int max_pro = 0;
        int min_price = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min_price){
                min_price = prices[i];
            }
            if(prices[i] - min_price > max_pro){
                max_pro = prices[i] - min_price;
            }
        }
        return max_pro;
    }
}