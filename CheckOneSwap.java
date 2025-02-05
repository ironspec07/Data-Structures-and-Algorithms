import java.util.*;
public class CheckOneSwap {
    public static boolean checkOneSwap(String s1 , String  s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        ArrayList<Integer> al = new ArrayList<>();
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                al.add(i);
            }
        }
        if (al.size() != 2) {
            return false;
        } 
        int a = al.get(0);
        int b = al.get(1);
        if (s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a)) {
            return true;
        }
        return false;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(checkOneSwap(s1, s2));
        sc.close();
    }
}
