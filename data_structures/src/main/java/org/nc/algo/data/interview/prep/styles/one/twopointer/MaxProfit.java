package org.nc.algo.data.interview.prep.styles.one.twopointer;

public class MaxProfit {
    public int maxProfit(int[] prices) {

        // Replace this placeholder return statement with your code
        int left = 0;
        int right = 1;
        int maxValue = 0;

        while  (right < prices.length - 1) {
            if (prices[left] > prices[right]) {
                left = left + 1;
                right += 1;
            } else if (prices[left] < prices[right]) {
                right += 1;
            }

            maxValue = Math.max(maxValue, prices[right]);
        }


        return maxValue - prices[left];
    }

    public static int maxProfitSolution(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxprofit = 0;

        while (sell < prices.length) {
            int currentProfit = prices[sell] - prices[buy];

            if (prices[buy] < prices[sell]) {
                maxprofit = Math.max(currentProfit, maxprofit);
            } else {
                buy = sell;
            }

            sell++;
        }

        return maxprofit;
    }

}
