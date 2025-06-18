package Hashmap;
import java.util.*;
public class AnagramPalindrome {
    public static int isPossible(String S){
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            hm.put(S.charAt(i), hm.getOrDefault(S.charAt(i), 0)+1);
        }
        int oddCount = 0;
        for (int i = 0; i < S.length(); i++) {
            int count = hm.get(S.charAt(i));
            if (count % 2 == 1) {
                oddCount++;
            }
            if (oddCount > 1) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int ans = isPossible(S);
        System.out.println(ans);
        sc.close();
    }
}
