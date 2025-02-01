import java.util.*;
public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while (a <= b) {
            a = a*3;
            b = b*2;
            System.out.println(a+" "+b);
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
