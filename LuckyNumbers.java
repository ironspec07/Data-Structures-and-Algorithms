import java.util.*;
public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean v = false;
        for (int i = a; i <= b; i++) {
            boolean flag = false;
            int t = i;
            while (t!=0) {
                int d = t%10;
                if (d!=4 && d!=7) {
                    flag = true;
                }
                t = t/10;
            }
            if (!flag) {
                System.out.print(i+" ");
                v = true;
            }
        }
        if (!v) {
            System.out.println("-1");
        }
        sc.close();
    }
}
