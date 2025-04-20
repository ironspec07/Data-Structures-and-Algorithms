// Problem-1328A-800
import java.util.*;
public class DivisiblityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // int steps = 0;
            // while (a%b != 0) {
            //     steps++;
            //     a++;
            // }
            int steps = (a % b == 0) ? 0 : (b - a % b);
            System.out.println(steps);
        }
        sc.close();
    }
}