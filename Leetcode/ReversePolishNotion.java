import java.util.*;
public class ReversePolishNotion {
    public static int calculate(String[] tokens){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int b = st.pop();
                int a = st.pop();
                int cal = a+b;
                st.push(cal);
            }
            else if (tokens[i].equals("-")) {
                int b = st.pop();
                int a = st.pop();
                int cal = a-b;
                st.push(cal);
            }
            else if (tokens[i].equals("*")) {
                int b = st.pop();
                int a = st.pop();
                int cal = a*b;
                st.push(cal);
            }
            else if (tokens[i].equals("/")) {
                int b = st.pop();
                int a = st.pop();
                int cal = a/b;
                st.push(cal);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        int ans = calculate(str);
        System.out.println(ans);
        sc.close();
    }
}
