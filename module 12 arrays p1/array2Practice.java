public class array2Practice {

    public static int BuySellStocks(int prices[]) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        
        for(int i=0;i<prices.length;i++){
            if(minPrice<=0){
                return 0;
            }
            else if(minPrice>prices[i]){
                minPrice = prices[i];
            }
            else if (i==prices.length) {
            }
            for(int j=i+1;j<prices.length;j++){
                if(maxPrice<prices[j]){
                    maxPrice = prices[j];
                }
            }
        }
        System.out.println("the best price to buy the stock is: "+minPrice);
        System.out.println("the best price to sell the stock is: "+maxPrice);
        maxProfit = maxPrice - minPrice;
        System.out.println("the max profit is: "+maxProfit);
        return 0;
    }
    public static void main(String[] args) {
        int prices[] = {7,6,4,2,1};
        BuySellStocks(prices);
    }
}
