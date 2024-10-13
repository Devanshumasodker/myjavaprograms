package Basicproblems;

public class BuyAndSellStock {
    class Solution {
        public int maxProfit(int[] prices) {
             if (prices == null || prices.length == 0) return 0;
           
            int minprice=prices[0];
            
            int profit = 0;
          
            for (int i=1;i<prices.length;i++){
                if(prices[i]<minprice){
                    minprice = prices[i];
                }
                else{
                    int profit1 = prices[i]-minprice;
                
                if(profit<profit1){
                    profit = profit1;
    
                }
                }
       }
        return profit;    
        }
    }
            
           
    
    
}
