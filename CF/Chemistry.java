import java.util.HashMap;
import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> freq = new HashMap<>();
            for (char c : s.toCharArray()) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
            int remainingLength = n - k;
            int oddCount = 0;
            for (int count : freq.values()) {
                if (count % 2 != 0) {
                    oddCount++;
                }
            }
            if (remainingLength % 2 == 0) {
                if (oddCount <= k && (k - oddCount) % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if (oddCount - 1 <= k && (k - (oddCount - 1)) % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}