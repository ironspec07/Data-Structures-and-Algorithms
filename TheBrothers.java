import java.util.*;

public class TheBrothers {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f1 = sc.next();
        String s1 = sc.next();
        String f2 = sc.next();
        String s2 = sc.next();
        if (s1.equals(s2)) { 
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }
        sc.close();
    }
}
