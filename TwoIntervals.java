import java.util.*;
public class TwoIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l1 = sc.nextLong();
        long r1 = sc.nextLong();
        long l2 = sc.nextLong();
        long r2 = sc.nextLong();
        if ((l2>r1 && r1<r2) || (l1>r2 && r1>r2)) {
            System.out.println("-1");
        } else{
            long x = Math.max(l1, l2);
            long y = Math.min(r1, r2);
            System.out.println(x+" "+y);
        }
        sc.close();
    }
}
