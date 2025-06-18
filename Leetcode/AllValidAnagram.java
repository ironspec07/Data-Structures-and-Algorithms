import java.util.*;
public class AllValidAnagram {
    public static List<Integer> findAnagrams(String s, String p) {
        if (p.length()>s.length()) {
            return new ArrayList<>();
        }
        HashMap<Character,Integer> hmS = new HashMap<>();
        HashMap<Character,Integer> hmP = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            hmP.put(p.charAt(i), hmP.getOrDefault(p.charAt(i), 0)+1);
        }
        int matchCount = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            hmS.put(s.charAt(i), hmS.getOrDefault(s.charAt(i), 0)+1);
            if (hmS.get(s.charAt(i)) <= hmP.getOrDefault(s.charAt(i), 0)) {
                matchCount++;
            }
        }
        if (matchCount == p.length()) {
            ans.add(0);
        }
        int sp = 0;
        int ep = p.length();
        while (ep<s.length()) {
            hmS.put(s.charAt(ep), hmS.getOrDefault(s.charAt(ep), 0)+1);
            if (hmS.get(s.charAt(ep)) <= hmP.getOrDefault(s.charAt(ep), 0)) {
                matchCount++;
            }
            hmS.put(s.charAt(sp), hmS.get(s.charAt(sp))-1);
            if (hmS.get(s.charAt(sp)) < hmP.getOrDefault(s.charAt(sp), 0)) {
                matchCount--;
            }
            sp++;
            ep++;
            if (matchCount == p.length()) {
                ans.add(sp);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        List<Integer> ans = findAnagrams(s,p);
        System.out.println(ans);
        sc.close();
    }
}