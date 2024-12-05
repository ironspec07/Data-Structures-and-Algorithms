import java.util.*;

public class QueueKthNumber {
    public static String kNumber(int k){
        Queue <String> q = new LinkedList<>();

        q.add("1");
        q.add("2");

        String ans = "";
        for (int i = 1; i <= k; i++) {
            String t = q.remove();
            if (i==k) {
                ans = t;
            }
            q.add(t+"1");
            q.add(t+"2");
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(kNumber(k));
        sc.close();
    }
}
