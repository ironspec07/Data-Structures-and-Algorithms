import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i)+rev;
        }
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
