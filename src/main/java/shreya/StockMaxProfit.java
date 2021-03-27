package shreya;

public class StockMaxProfit {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int min = prices[0];
        int max = prices[0];
        int profit = max - min;

        for(int i=1; i< prices.length; i++){
            if(prices[i]<=min){
                min = prices[i];
                max = prices[i];
            } else{
                max = prices[i];
            }
            if((max-min)>profit){
                profit = max-min;
            }
        }
        return profit;
    }


    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(new StockMaxProfit().maxProfit(prices));
    }
}
