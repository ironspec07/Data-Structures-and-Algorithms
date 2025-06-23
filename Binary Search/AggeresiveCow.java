import java.util.*;
public class AggeresiveCow {
    public static int count(int[] pos, int m){
        int cowsPlaced = 1;
        int lastCowPos = pos[0];
        for (int i = 1; i < pos.length; i++) {
            if (pos[i]-lastCowPos >= m) {
                cowsPlaced++;
                lastCowPos = pos[i];
            }
        }
        return cowsPlaced;
    }
    public static int maxDistance(int[] dist , int k){
        int lo = Integer.MAX_VALUE;
        int hi = 0;
        for (int i = 0; i < dist.length-1; i++) {
            int diff = dist[i+1]-dist[i];
            lo = Math.min(lo, diff);
        }
        hi = dist[dist.length-1]-dist[0];
        int ans = -1;
        while (lo <= hi) {
            int m = lo+(hi-lo)/2;
            int cowsPlaced = count(dist,m);
            if (cowsPlaced >= k) {
                ans = m;
                lo = m+1;
            }
            else{
                hi = m-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cows = sc.nextInt();
        int[] distance = new int[n];
        for (int i = 0; i < distance.length; i++) {
            distance[i] = sc.nextInt();
        }
        Arrays.sort(distance);
        int ans = maxDistance(distance,cows);
        System.out.println(ans);
        sc.close();
    }
}
