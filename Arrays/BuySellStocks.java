package Arrays;

public class BuySellStocks {
     
    // You are given array prices where prices[i] is the price of a given stock
    // of the ith day. You want to maximize your profit by choosing a single day to 
    // buy one stock and choosing a different day in the future to sell that stock.
    // Return the maximum profit you can achieve from this transcation. If you cannot
    // achieve any profit, return 0.
    

    public static int buysellStock(int prices[]) {
    //    int[] minDay = new int[prices.length];
    //    minDay[0] = prices[0];
    //    for(int i=1;i<prices.length;i++){
    //     minDay[i] = Math.min(minDay[i-1],prices[i]);
    //    }
    //    int maxProfit = 0;
    //    for(int i=0;i<prices.length;i++){
    //       maxProfit = Math.max(prices[i]-minDay[i],maxProfit);
    //    }
    //    return maxProfit;



       int buyPrice = Integer.MAX_VALUE;
       int maxProfit = 0;

       for (int i = 0; i < prices.length; i++) {
           if (buyPrice < prices[i]) {
               int profit = prices[i] - buyPrice;
               maxProfit = Math.max(maxProfit, profit);
           }
           else {
               buyPrice = prices[i];
           }
       }
       return maxProfit;
    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int maximumProfit = buysellStock(prices);
        System.out.println(maximumProfit);
    }
}
