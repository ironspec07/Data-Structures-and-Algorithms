//leetcode - 989
import java.util.*;
public class ArrayInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        long x = 0;
        for (int i = 0; i < num.length; i++) {
            x = x*10 + num[i];
        }
        x = x + k;
        String h = x + "";
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < h.length(); i++) {
            int a = h.charAt(i)-'0';
            ls.add(a);
        }
        System.out.println(ls);
        sc.close();
    }
}
