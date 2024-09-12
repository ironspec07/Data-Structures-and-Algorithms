import java.util.*;
public class CheckCode {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        if (str.charAt(a)!='-') {
            System.out.println("No");
            System.exit(0);
        }
        int len = str.length();
        boolean ch = false;
        for (int i = 0; i < len; i++) {
            if ((str.charAt(i)<'0' || str.charAt(i)>'9') && i != a) {
                ch = true;
            }
        }
        if (ch==false) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
