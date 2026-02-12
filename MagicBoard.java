import java.util.*;
public class MagicBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int c4 = sc.nextInt();

        System.out.print((char)c1);
        System.out.print((char)c2);
        System.out.print((char)c3);
        System.out.print((char)c4);
        sc.close();
    }
}