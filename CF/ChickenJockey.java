import java.io.*;
import java.util.*;

public class ChickenJockey {
    static final long MOD1 = 1000000007L;
    static final long MOD2 = 1000000009L;
    static final long MOD3 = 998244353L;
    static final double PI = 3.141592653589793238;
    static final double EPS = 1e-9;
    static final int MAXN = 500000;

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int num = sc.nextInt();
            long[] heights = new long[num];
            for (int i = 0; i < num; i++) heights[i] = sc.nextLong();

            long total = 0;
            for (long x : heights) total += x;
            total -= (num - 1);

            long prev1 = 0, prev2 = 0;
            for (int i = 1; i < num; i++) {
                long weight = Math.min(i, (int) heights[i]) - 2;
                if (weight < 0) weight = 0;
                long current = Math.max(prev2, prev1 + weight);
                prev1 = prev2;
                prev2 = current;
            }

            out.println(total - prev2);
        }

        out.flush();
    }
}