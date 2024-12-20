import java.util.*;
public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        int lh = haystack.length();
        int ln = needle.length();
        int fo = -1;
        for (int i = 0; i < lh-ln+1; i++) {
            String sub = haystack.substring(i, i+ln);
            if (sub.equals(needle)) {
                fo = i;
                break;
            }
        }
        System.out.println(fo);
        sc.close();
    }
}
