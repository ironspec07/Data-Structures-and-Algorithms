import java.util.Scanner;

public class Xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        long Q = sc.nextLong();
        
        long result;
        if (Q == 1) {
            result = A;
        } else if (Q == 2) {
            result = B;
        } else {
            int mod = (int) ((Q - 1) % 3);
            if (mod == 0) {
                result = A;
            } else if (mod == 1) {
                result = B;
            } else {
                result = A ^ B;
            }
        }
        
        System.out.println(result);
        
        sc.close();
    }
}
