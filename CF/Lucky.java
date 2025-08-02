import java.util.*;
public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int frontPart = n%1000;
            int lastPart = n/1000;
            int sum1 = 0;
            int sum2 = 0;
            while (frontPart != 0) {
                int ld = frontPart%10;
                sum1 += ld;
                frontPart = frontPart/10;
            }
            while (lastPart != 0) {
                int ld = lastPart%10;
                sum2 += ld;
                lastPart = lastPart/10;
            }
            if (sum1 == sum2) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
