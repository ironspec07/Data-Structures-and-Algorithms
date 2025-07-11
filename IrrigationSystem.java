import java.util.*;

public class IrrigationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int on = calcOn(A, T);
        int max = on;

        for (int i = 0; i <= N; i++) {
            int t;
            
            if (i == 0) {
                if (N == 0) {
                    t = T / 2;
                } else if (A[0] > 1) {
                    t = A[0] - 1;
                    int newOn = calcOn(insert(A, i, t), T);
                    max = Math.max(max, newOn);
                }
            } 
            else if (i == N) {
                if (A[N-1] < T - 1) {
                    t = A[N-1] + 1;
                    int newOn = calcOn(insert(A, i, t), T);
                    max = Math.max(max, newOn);
                }
            } 
            else {
                if (A[i] - A[i-1] > 1) {
                    t = A[i-1] + 1;
                    int newOn = calcOn(insert(A, i, t), T);
                    max = Math.max(max, newOn);
                }
            }
        }

        System.out.println(max);
        sc.close();
    }

    private static int[] insert(int[] a, int pos, int t) {
        int[] newA = new int[a.length + 1];
        System.arraycopy(a, 0, newA, 0, pos);
        newA[pos] = t;
        System.arraycopy(a, pos, newA, pos + 1, a.length - pos);
        return newA;
    }

    private static int calcOn(int[] a, int T) {
        int on = 0;
        boolean state = true;
        int prev = 0;

        for (int t : a) {
            if (state) {
                on += t - prev;
            }
            state = !state;
            prev = t;
        }

        if (state) {
            on += T - prev;
        }

        return on;
    }
}