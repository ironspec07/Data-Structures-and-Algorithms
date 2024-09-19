import java.util.*;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        int a = Math.max(S.length(), T.length());
        for (int i = 0; i < a; i++) {
            if (S.charAt(i)>T.charAt(i)) {
                System.out.println(T);
                break;
            }
            else if (S.charAt(i)<T.charAt(i)) {
                System.out.println(S);
                break;
            }
        }
        if (S==T) {
            System.out.println(S);
        }
        sc.close();
    }
}
