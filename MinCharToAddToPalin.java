import java.util.*;;
public class MinCharToAddToPalin {
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
    private static String reverse(String str) {
        StringBuilder s = new StringBuilder(str);
        int sp = 0;
        int ep = s.length() - 1;
    
        while (sp < ep) {
            char temp = s.charAt(sp);
            s.setCharAt(sp, s.charAt(ep));
            s.setCharAt(ep, temp);
            sp++;
            ep--;
        }
    
        return s.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s1 = str+"#"+reverse(str);
        int[] lps = Lps(s1);
        int lpsn = Integer.MIN_VALUE;
        for (int i = 0; i < lps.length; i++) {
            if (lps[i] > lpsn) {
                lpsn = lps[i];
            }
        }
        int ans = str.length()-lpsn;
        System.out.println(ans);
        sc.close();
    }
}
