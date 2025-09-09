import java.util.*;
public class MinRefulingStops {
    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int curr = startFuel;
        int i = 0;
        int ans = 0;
        while (curr < target) {
            while (i < stations.length && stations[i][0] <= curr) {
                pq.add(stations[i][1]);
                i++;
            }
            if (pq.size() == 0) {
                return -1;
            }
            curr = curr+pq.remove();
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int startFuel = sc.nextInt();
        int n = sc.nextInt();
        int[][] stations = new int[n][2];
        for (int i = 0; i < stations.length; i++) {
            stations[i][0] = sc.nextInt();
            stations[i][1] = sc.nextInt();
        }
        int ans = minRefuelStops(target,startFuel,stations);
        System.out.println(ans);
        sc.close();
    }
}
