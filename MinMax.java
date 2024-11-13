import java.util.*;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i<min) {
                min=i;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i>max) {
                max=i;
            }
        }
        System.out.println(min+" "+max);
        sc.close();
    }
}
