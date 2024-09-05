import java.util.*;
public class AliBabaAndPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        if ((a+b-c)==d||(a+b*c)==d) {
            System.out.println("YES");
        }
        else if ((a-b+c)==d||(a-b*c)==d) {
            System.out.println("YES");
        }
        else if ((a*b+c)==d||(a*b-c)==d) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
