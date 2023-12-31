class Solution {
    public int maxProfit(int[] prices) {
        
        int least = Integer.MAX_VALUE;
        int maxprofit = 0;
        int curr_profit = 0;
        
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i] < least)
                least= prices[i]; 
          
        curr_profit = prices[i] - least;
        if(maxprofit < curr_profit)
            maxprofit = curr_profit;
    }
    return maxprofit;
    }
    
    }


