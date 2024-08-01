import java.util.*;
public class SummationFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = n*(n+1)/2;
        System.out.println(result);
        sc.close();
    }
}
