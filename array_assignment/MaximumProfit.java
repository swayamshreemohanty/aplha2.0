public class MaximumProfit {

    public static int maxProfitAmount(int[] stockPrices) {
        int maxProfit = Integer.MIN_VALUE;
        int buyPrice = Integer.MAX_VALUE;
        for (int priceIndex = 0; priceIndex < stockPrices.length; priceIndex++) {
            if (buyPrice < stockPrices[priceIndex]) {
                int todayProfit = stockPrices[priceIndex] - buyPrice;
                maxProfit = Integer.max(todayProfit, maxProfit);
            } else {
                buyPrice = stockPrices[priceIndex];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices = { 7, 1, 5, 8, 3, 6, 4 };

        System.out.println("The maximum profit is: " + maxProfitAmount(stockPrices));
    }
}
