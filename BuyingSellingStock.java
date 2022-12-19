public class BuyingSellingStock {

    public static int maximumProfit(int[] stockPrices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int day = 0; day < stockPrices.length; day++) {
            if (buyPrice < stockPrices[day]) {
                int profit = stockPrices[day] - buyPrice;
                maxProfit = Integer.max(maxProfit, profit);
            } else {
                buyPrice = stockPrices[day];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices = { 7, 1, 5, 3, 6, 4 };

        System.out.println("Maximum profit is: " + maximumProfit(stockPrices));
    }
}
