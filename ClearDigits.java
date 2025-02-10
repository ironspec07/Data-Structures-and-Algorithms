import java.util.*;

public class ClearDigits {
    private static String remove(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;

        while (i < sb.length()) {
            char ch = sb.charAt(i);

            if (Character.isDigit(ch)) {
                int left = i - 1;
                while (left >= 0 && Character.isDigit(sb.charAt(left))) {
                    left--;
                }
                if (left >= 0) {
                    sb.deleteCharAt(left);
                    i--;
                }
                sb.deleteCharAt(i);
            } else {
                i++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = remove(s);
        System.out.println(ans);
        sc.close();
    }
}
