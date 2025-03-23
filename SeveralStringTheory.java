import java.util.Scanner;

public class SeveralStringTheory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            if(n == 1 || isAllSame(s)) {
                System.out.println("NO");
                continue;
            }
            

            if(isUniversal(s)) {
                System.out.println("YES");
            } else {

                System.out.println(k >= 1 ? "YES" : "NO");
            }
        }
        sc.close();
    }
    
    private static boolean isAllSame(String s) {
        char first = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != first) {
                return false;
            }
        }
        return true;
    }
    

    private static boolean isUniversal(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            char left = s.charAt(i);
            char right = s.charAt(n - 1 - i);
            if(left != right) {
                return left < right;
            }
        }

        return false;
    }
}
