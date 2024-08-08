import java.util.*;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            String n = sc.nextLine();
            for (int j = n.length() - 1; j >= 0; j--) {
                char a = n.charAt(j);
                System.out.print(a + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
