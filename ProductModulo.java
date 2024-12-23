import java.util.*;
import java.math.BigInteger;

public class ProductModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();
        long M = sc.nextLong();
        BigInteger product = BigInteger.ONE;
        BigInteger modulo = BigInteger.valueOf(M);
        for (long i = L; i <= R; i++) {
            product = product.multiply(BigInteger.valueOf(i)).mod(modulo);
        }
        System.out.println(product);
        sc.close();
    }
}
