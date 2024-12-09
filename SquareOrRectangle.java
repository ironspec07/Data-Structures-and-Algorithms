import java.util.Scanner;

public class SquareOrRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            if (w==h) {
                System.out.println("Square");
            }
            else{
                System.out.println("Rectangle");
            }
        }
        sc.close();
    }
}
