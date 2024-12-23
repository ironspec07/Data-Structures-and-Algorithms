import java.util.*;
public class ApOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int d = arr[1]-arr[0];
        boolean result = true;
        for (int i = 0; i < n-1; i++) {
            if (arr[i+1]-arr[i]!=d) {
                result = false;
                break;
            }
        }
        System.out.println(result);
        sc.close();
    }
}