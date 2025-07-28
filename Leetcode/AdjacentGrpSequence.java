//Leetcode - 2900
import java.util.*;

public class AdjacentGrpSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        int[] groups = new int[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            groups[i] = sc.nextInt();
        }
        List<String> ls = new ArrayList<>();
        int last = -1;
        for (int i = 0; i < words.length; i++) {
            if (groups[i] != last) {
                ls.add(words[i]);
                last = groups[i];
            }
        }
        System.out.println(ls);
        sc.close();
    }
}