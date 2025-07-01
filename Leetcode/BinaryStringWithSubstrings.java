import java.util.*;
public class BinaryStringWithSubstrings {
    public static boolean queryString(String s, int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n-- > 0) {
            String rem = q.remove();
            if (!s.contains(rem)) {
                return false;
            }
            q.add(rem+"0");
            q.add(rem+"1");
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        boolean ans = queryString(s,n);
        System.out.println(ans);
        sc.close();
    }
}
