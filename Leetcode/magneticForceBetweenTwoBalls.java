import java.util.*;
public class magneticForceBetweenTwoBalls {
    public static int count(int[] pos, int m){
        int ballsPlaced = 1;
        int lastBallPos = pos[0];
        for (int i = 1; i < pos.length; i++) {
            if (pos[i]-lastBallPos >= m) {
                ballsPlaced++;
                lastBallPos = pos[i];
            }
        }
        return ballsPlaced;
    }
    public static int maxDistance(int[] position , int m){
        int lo = Integer.MAX_VALUE;
        int hi = 0;
        for (int i = 0; i < position.length-1; i++) {
            int diff = position[i+1]-position[i];
            lo = Math.min(lo, diff);
        }
        hi = position[position.length-1]-position[0];
        int ans = -1;
        while (lo <= hi) {
            int mid = lo+(hi-lo)/2;
            int ballsPlaced = count(position,mid);
            if (ballsPlaced >= m) {
                ans = mid;
                lo = mid+1;
            }
            else{
                hi = mid-1;
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
