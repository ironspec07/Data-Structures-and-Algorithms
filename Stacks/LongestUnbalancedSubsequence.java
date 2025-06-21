package Stacks;
import java.util.*;
public class LongestUnbalancedSubsequence {
    private static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (st.size() == 0 || ch == '(') {
                st.push(ch);
            } 
            else {
                if (ch == ')') {
                    if (st.peek() == '(') {
                        st.pop();
                    } 
                    else {
                        return false;
                    }
                    
                }
                
            }
        }
        if (st.size()==0) {
            return true;
        }
        else{
            return false;
        }
    }
    public static int longestUnbalancedSubsequence(String str){
        if (isBalanced(str)) {
            return str.length()-1;
        }
        else{
            return str.length();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = longestUnbalancedSubsequence(str);
        System.out.println(ans);
        sc.close();
    }
}
