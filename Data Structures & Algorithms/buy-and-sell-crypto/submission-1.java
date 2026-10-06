class Solution {
    public int maxProfit(int[] prices) {
        //using two pointers to solve this sliding window prblm
        int buyD =0;
        int sellD=1;
        int maxP =0;


        while(sellD < prices.length){
            if(prices[sellD] > prices[buyD]){
                int profit = prices[sellD] - prices[buyD];
                maxP = Math.max(maxP , profit);
            }else{
                buyD = sellD;
            }
            sellD++;
        }
        return maxP;
    }
}
