import java.util.*;
public class PUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(x+" ");
                x++;
            }
            System.out.println("PUM");
            x++;
        }
        sc.close();
    }
}
