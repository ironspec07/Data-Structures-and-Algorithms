import java.util.*;
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        int min = prices[0];
        int profit = 0;
        for (int i : prices) {
            if (i-min > profit) {
                profit = i-min;
            }
            min = Math.min(min, i);
        }
        System.out.println(profit);
        sc.close();
    }
}
