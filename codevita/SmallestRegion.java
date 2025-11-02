package codevita;
import java.util.*;

public class SmallestRegion {
    private static long computeMinGap(List<Integer> vf) {
        long ans = Long.MAX_VALUE;
        for (int i = 0; i + 1 < vf.size(); ++i) {
            int d = vf.get(i + 1) - vf.get(i);
            if (d == 1) return 1;
            if (d < ans) ans = d;
        }
        return ans;
    }
    private static long checkGaps(List<Integer> a, List<int[]> recList, int i1, int i2, long ans) {
        for (int i = 0; i + 1 < a.size(); ++i) {
            int x = a.get(i), y = a.get(i + 1);
            if (y - x <= 1) continue;
            boolean flag = false;
            for (int[] rec : recList) {
                if (rec[i1] <= x && y <= rec[i2]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) return 1;
        }
        return ans;
    }
    private static long computeGap(List<int[]> recList, int lo, int hi, int i1, int i2){
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(lo);
        ts.add(hi);
        for (int[] rec : recList) {
            ts.add(rec[i1]);
            ts.add(rec[i2]);
        }
        List<Integer> a = new ArrayList<>(ts);

        List<Integer> vf = new ArrayList<>();
        for (int x : a) {
            boolean test = true;
            for (int[] rec : recList) {
                if (rec[i1] < x && x < rec[i2]) {
                    test = false;
                    break;
                }
            }
            if (test) vf.add(x);
        }
        long ans = computeMinGap(vf);
        ans = checkGaps(a, recList, i1, i2, ans);
        return ans;
    }
    public static long gapAnaY(List<int[]> recList, int lo, int hi, int ax) {
        int i1 = 1;
        int i2 = 3;
        return computeGap(recList, lo, hi, i1, i2);
    }
    public static long gapAnaX(List<int[]> recList, int lo, int hi, int ax) {
        // int i1 = (ax == 0 ? 0 : 1), i2 = (ax == 0 ? 2 : 3);
        int i1 = 0;
        int i2 = 2;
        return computeGap(recList, lo, hi, i1, i2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[]> recList = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int[] r = new int[4];
            for (int j = 0; j < 4; ++j) r[j] = sc.nextInt();
            recList.add(r);
        }
        int x1 = sc.nextInt(); 
        int y1 = sc.nextInt(); 
        int x2 = sc.nextInt(); 
        int y2 = sc.nextInt();
        long w = gapAnaX(recList, x1, x2, 0);
        long h = gapAnaY(recList, y1, y2, 1);
        System.out.println(w * h);
        sc.close();
    }
}

