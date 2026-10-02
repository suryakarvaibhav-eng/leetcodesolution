class Solution {
    public int buyChoco(int[] prices, int money) {

        int minPrice = Integer.MAX_VALUE;
        int secondMinPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                secondMinPrice = minPrice;
                minPrice = prices[i];
            }
            else if (prices[i] < secondMinPrice) {
                secondMinPrice = prices[i];
            }
        }

        int total = minPrice + secondMinPrice;

        if (total <= money) {
            return money - total;
        }

        return money;
    }
}