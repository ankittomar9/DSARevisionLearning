package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_62_Best_Time_To_Buy_Sell_Stock {
    public static void main(String args[]) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Stock Prices : " + Arrays.toString(prices));
        int profit = maxProfit(prices);
        System.out.println("Maximum Profit : " + profit);
    }

    public static int maxProfit(int[] prices) {
        // Edge case
        if (prices == null || prices.length < 2) {  return 0;     }
        int minPrice = Integer.MAX_VALUE;
        
        int maxProfit = 0;
        for (int i=0; i<prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            else {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }
}