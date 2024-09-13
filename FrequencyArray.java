import java.util.*;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    freq++;
                }
            }
            System.out.println(freq);
        }
        sc.close();
    }
}
