import java.util.*;
public class SimpleCalulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println(a+" - "+b+" = "+(a-b));
        sc.close();
    }
}
