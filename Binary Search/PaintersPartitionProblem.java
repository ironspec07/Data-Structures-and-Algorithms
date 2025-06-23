import java.util.*;
public class PaintersPartitionProblem {
    public static int calculate(int[] time, int m){
        int workers = 1;
        int sum = 0;
        for (int t : time) {
            if (sum+t > m)  {
                workers++;
                sum = 0;
            }
            sum = sum+t;
        }
        return workers;
    }
    public static int paintersPartition(int[] time ,int worker){
        int lo = Integer.MIN_VALUE;
        int hi = 0;
        for (int i = 0; i < time.length; i++) {
            lo = Math.max(lo, time[i]);
            hi = hi+time[i];
        }
        int ans = 0;
        while (lo <= hi) {
            int m = lo+(hi-lo)/2;
            int reqWorkers = calculate(time,m);
            if (reqWorkers <= worker) {
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
        int[] time = new int[n];
        for (int i = 0; i < time.length; i++) {
            time[i] = sc.nextInt();
        }
        int workers = sc.nextInt();
        int ans = paintersPartition(time,workers);
        System.out.println(ans);
        sc.close();
    }
}
