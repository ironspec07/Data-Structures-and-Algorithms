import java.util.*;
public class KokoAndTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[m];
        for (int i = 0; i < n; i++) {
            num1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            num2[i] = sc.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += num1[i];
        }
        for (int i = 0; i < m; i++) {
            sum2 += num2[i];
        }
        if (sum1 == sum2) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
