import java.util.*;
public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = 0;
        int e = n-1;
        while (s<e) {
            if (arr[s]!=arr[e]) {
            }
            s++;
            e--;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
