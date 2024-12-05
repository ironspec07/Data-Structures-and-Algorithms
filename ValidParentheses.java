import java.util.*;

public class ValidParentheses {
    public static boolean validParentheses(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (st.size() == 0 || ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else {
                if (ch == ')') {
                    if (st.peek() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
                else if (ch == '}') {
                    if (st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                } 
                else {
                    if (st.peek() == '[') {
                        st.pop();
                    } else {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(validParentheses(str));
        sc.close();
    }
}
