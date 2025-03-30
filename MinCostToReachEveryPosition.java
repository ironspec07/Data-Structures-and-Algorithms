import java.util.*;
public class MinCostToReachEveryPosition {
    private static int[] minCost(int[] cost){
        int[] ans = new int[cost.length];
        int min = cost[0];
        ans[0] = min;
        for (int i = 1; i < cost.length; i++) {
            if (cost[i] < min) {
                min = cost[i];
            }
            ans[i] = min;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = minCost(arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}