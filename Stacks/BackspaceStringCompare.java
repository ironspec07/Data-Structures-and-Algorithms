package Stacks;
import java.util.*;
public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#' && st1.size() != 0) {
                st1.pop();
            }
            else if (ch == '#' && st1.size() == 0) {
                continue;
            }
            else{
                st1.push(ch);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch == '#' && st2.size() != 0) {
                st2.pop();
            }
            else if (ch == '#' && st2.size() == 0) {
                continue;
            }
            else{
                st2.push(ch);
            }
        }
        if (st1.size() != st2.size()) {
            return false;
        }
        while (st1.size() != 0) {
            char a = st1.pop();
            char b = st2.pop();
            if (a != b) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean ans = backspaceCompare(s1,s2);
        System.out.println(ans);
        sc.close();
    }
}
