import java.util.*;
public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (t.length()>s.length()) {
            return "";
        }
        if (t.length() == 1 && s.length()==1 && (s.charAt(0)!=t.charAt(0))) {
            return "";
        }
        HashMap<Character,Integer> hmS = new HashMap<>();
        HashMap<Character,Integer> hmT = new HashMap<>();
        int matchCount = 0;
        for (int i = 0; i < t.length(); i++) {
            hmT.put(t.charAt(i), hmT.getOrDefault(t.charAt(i), 0)+1);
        }
        int ansLen = Integer.MAX_VALUE;
        int ansSIdx = -1;
        int ansEIdx = -1;
        int sp = 0;
        int ep = 0;
        while (ep<s.length()) {
            if (matchCount == t.length()) {
                if (ep-sp < ansLen) {
                    ansLen = ep-sp;
                    ansSIdx = sp;
                    ansEIdx = ep-1;
                }
                hmS.put(s.charAt(sp), hmS.get(s.charAt(sp))-1);
                if (hmS.get(s.charAt(sp)) < hmT.getOrDefault(s.charAt(sp), 0)) {
                    matchCount--;
                }
                sp++;
            }
            else {
                hmS.put(s.charAt(ep), hmS.getOrDefault(s.charAt(ep), 0)+1);
                if (hmS.get(s.charAt(ep)) <= hmT.getOrDefault(s.charAt(ep), 0)) {
                    matchCount++;
                }
                ep++;
            }
        }
        while (matchCount == t.length()) {
            if (matchCount == t.length()) {
                if (ep-sp < ansLen) {
                    ansLen = ep-sp;
                    ansSIdx = sp;
                    ansEIdx = ep-1;
                }
                hmS.put(s.charAt(sp), hmS.get(s.charAt(sp))-1);
                if (hmS.get(s.charAt(sp)) < hmT.getOrDefault(s.charAt(sp), 0)) {
                    matchCount--;
                }
                sp++;
            }
        }
        if (ansSIdx < 0 || ansEIdx < 0 ) {
            return "";
        }
        return s.substring(ansSIdx, ansEIdx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String ans = minWindow(s,t);
        System.out.println(ans);
        sc.close();
    }
}