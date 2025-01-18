import java.util.Scanner;

public class DrawingX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 && i == j) {
                    System.out.print("X");
                } else if (i == j) {
                    System.out.print("\\");
                } else if (j != n / 2 && i == (n - 1) - j) {
                    System.out.print("/");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
