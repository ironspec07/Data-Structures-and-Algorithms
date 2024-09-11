import java.util.Scanner;

public class FloorSQRTN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int ans = 0;
        while (i * i <= n) {
            ans = i;
            i++;
        }
        System.out.println(ans);
        sc.close();
    }
}
