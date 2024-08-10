// import java.util.*;
// public class MemoAndMomo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long a = sc.nextInt();
//         long b = sc.nextInt();
//         long k = sc.nextInt();
//         if (a%k==0 && b%k==0) {
//             System.out.println("Both");
//         } else if (a%k==0 && b%k!=0) {
//             System.out.println("Memo");
//         } else if (a%k!=0 && b%k==0) {
//             System.out.println("Momo");
//         } else {
//             System.out.println("No One");
//         }
//         sc.close();
//     }
// }
import java.math.BigInteger;
import java.util.Scanner;

public class MemoAndMomo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger k = sc.nextBigInteger();
        
        boolean aDivisible = a.mod(k).equals(BigInteger.ZERO);
        boolean bDivisible = b.mod(k).equals(BigInteger.ZERO);
        
        if (aDivisible && bDivisible) {
            System.out.println("Both");
        } else if (aDivisible) {
            System.out.println("Memo");
        } else if (bDivisible) {
            System.out.println("Momo");
        } else {
            System.out.println("No One");
        }
        
        sc.close();
    }
}
