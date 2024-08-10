import java.util.*;
public class SequenceOfNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x<=0||y<=0) {
                break;
            }
            int sum=0;
            for (int i = Math.min(x, y); i <= Math.max(x, y); i++) {
                System.out.print(i+" ");
                sum = sum + i;
            }
            System.out.println("sum ="+sum);
        }
        sc.close();
    }
}
