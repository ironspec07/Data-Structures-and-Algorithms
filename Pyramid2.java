// import java.util.Scanner;

// public class Pyramid2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printPyramid(n, 1);
//         sc.close();
//     }

//     private static void printPyramid(int n, int currentRow) {
//         if (currentRow > n) {
//             return;
//         }
//         printSpaces(n - currentRow);
//         printStars(2 * currentRow - 1);
//         System.out.println();
//         printPyramid(n, currentRow + 1);
//     }

//     private static void printSpaces(int count) {
//         if (count <= 0) {
//             return;
//         }
//         System.out.print(" ");
//         printSpaces(count - 1);
//     }

//     private static void printStars(int count) {
//         if (count <= 0) {
//             return;
//         }
//         System.out.print("*");
//         printStars(count - 1);
//     }
// }
import java.util.Scanner;

public class Pyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
