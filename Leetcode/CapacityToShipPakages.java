import java.util.*;
public class CapacityToShipPakages {
    public static int calculate(int[] wt, int m){
        int days = 1;
        int sum = 0;
        for (int w : wt) {
            if (sum+w > m)  {
                days++;
                sum = 0;
            }
            sum = sum+w;
        }
        return days;
    }
    public static int shipWithinDays(int[] weights, int days){
        int lo = Integer.MIN_VALUE;
        int hi = 0;
        for (int i = 0; i < weights.length; i++) {
            lo = Math.max(lo, weights[i]);
            hi = hi+weights[i];
        }
        int ans = 0;
        while (lo <= hi) {
            int m = lo+(hi-lo)/2;
            int reqDays = calculate(weights,m);
            if (reqDays <= days) {
                ans = m;
                hi = m-1;
            }
            else{
                lo = m+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int days = sc.nextInt();
        int[] wt = new int[n];
        for (int i = 0; i < wt.length; i++) {
            wt[i] = sc.nextInt();
        }
        int ans = shipWithinDays(wt,days);
        System.out.println(ans);
        sc.close();
    }
}
