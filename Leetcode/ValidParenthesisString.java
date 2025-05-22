import java.util.*;
class ValidParenthesisString {
    public static boolean isValid(String s) {
        int minOpen = 0, maxOpen = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                minOpen++;
                maxOpen++;
            } else if (ch == ')') {
                minOpen--;
                maxOpen--;
            } else { // ch == '*'
                minOpen--;
                maxOpen++;
            }

            if (minOpen < 0) minOpen = 0;
            if (maxOpen < 0) return false;
        }

        return minOpen == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean ans = isValid(str);
        System.out.println(ans);
        sc.close();
    }
}