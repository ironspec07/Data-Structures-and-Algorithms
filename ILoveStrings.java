import java.util.*;
public class ILoveStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int k = 1; k <= n; k++) {
            String input = sc.nextLine();
            String[] strings = input.split(" ");
            String str1 = strings[0];
            String str2 = strings[1];
            String str3 = "";
            int len = Math.max(str1.length(), str2.length());
            for (int i = 0; i < len; i++) {
                if (i<str1.length()) {
                    str3 = str3 + str1.charAt(i);
                }
                if (i<str2.length()) {
                    str3 = str3 + str2.charAt(i);
                }
            }
            System.out.println(str3);
        }
        sc.close();
    }
}
