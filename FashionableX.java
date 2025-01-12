import java.util.Scanner;

public class FashionableX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && i == n / 2) {
                    System.out.print("X");
                } else if (i == j) {
                    System.out.print("\\");
                } else if (i + j == n - 1) {
                    System.out.print("/");
                } else if ((i < j && i + j < n - 1) || (i > j && i + j > n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
