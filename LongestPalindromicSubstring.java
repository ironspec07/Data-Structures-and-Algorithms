import java.util.*;
public class LongestPalindromicSubstring {
    private static boolean palin(String str){
        int left = 0;
        int right = str.length()-1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    private static int maxPalin(String s , String t){
        int n = s.length();
        int m = s.length();
        int maxLen = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                String sub1 = s.substring(i, j);

                for (int k = 0; k <= m; k++) {
                    for (int k2 = k; k2 <= m; k2++) {
                        String sub2 = t.substring(k,k2);

                        String concat = sub1+sub2;

                        if (palin(concat)) {
                            maxLen = Math.max(maxLen, concat.length());
                        }
                    }
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int ans = maxPalin(s,t);
        System.out.println(ans);
        sc.close();
    }
}
