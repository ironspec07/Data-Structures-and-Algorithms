import java.util.*;
public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double div = a/b;

        System.out.println("floor "+(long)a+" / "+(long)b+" = "+(long)Math.floor(div));
        System.out.println("ceil "+(long)a+" / "+(long)b+" = "+(long)Math.ceil(div));
        System.out.println("round "+(long)a+" / "+(long)b+" = "+(long)Math.round(div));
        sc.close();
    }
}
