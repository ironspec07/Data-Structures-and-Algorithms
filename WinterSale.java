import java.util.*;
public class WinterSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int p = sc.nextInt();
        double op = p/(1-(x/100.0));
        System.out.println(String.format("%.2f", op));
        sc.close();
    }
}
