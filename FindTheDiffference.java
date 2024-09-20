import java.util.*;

public class FindTheDiffference {
    public char findTheDifference(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (s.indexOf(ch) == -1) {
                return ch;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (str.indexOf(ch) == -1) {
                System.out.println(ch);
                break;
            }
        }
        sc.close();
    }
}
