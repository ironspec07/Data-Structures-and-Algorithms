import java.util.*;
public class LPS {
    private static int[] Lps(String s){
        int[] lps = new int[s.length()];
        lps[0] = 0;
        for (int i = 1; i < lps.length; i++) {
            int len = lps[i-1];
            if (s.charAt(i) == s.charAt(len)) {
                lps[i] = len+1;
            }
            else{
                while (s.charAt(i) != s.charAt(len)) {
                    if (len == 0) {
                        len = -1;
                        break;
                    }
                    len = lps[len-1];
                }
                lps[i] = len+1;
            }
        }
        return lps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] lps = Lps(s);
        for (int i : lps) {
            System.out.println(i+" ");
        }
        sc.close();
    }
}
