import java.util.*;
public class CountGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i : arr) {
            if (i>=max) {
                max = i;
            }
        }
        int count = 0;
        for (int i : arr) {
            if (i==max) {
                count++;
            }
        }
        System.out.println(n-count);
        sc.close();
    }
}
