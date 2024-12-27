import java.util.Scanner;

public class PrintDigits {
    public static void printDigits(long n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }
        printDigits(n / 10); 
        System.out.print(n % 10 + " "); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(); 
            printDigits(n); 
            System.out.println();
        }
        sc.close();
    }
}
