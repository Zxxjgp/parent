package chart1;

import java.util.Collections;

class Solution {


    public static void main(String args[]) {
        int[] prices = new int[] {7,1,5,3,6,4};
        int max = maxProfit(prices);
        System.out.println(max);
        Collections.reverseOrder();
    }
 
    public static int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for(int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}