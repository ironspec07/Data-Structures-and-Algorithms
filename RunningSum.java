import java.util.*;
public class RunningSum {
    public static int[] prefix(int[] arr){
        int n = arr.length;
        int[] pf = new int[n];
        pf[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i-1]+arr[i];
        }
        return pf;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] pf = prefix(arr);
        for (int i : pf) {
            System.out.println(i);
        }
        sc.close();
    }
}
