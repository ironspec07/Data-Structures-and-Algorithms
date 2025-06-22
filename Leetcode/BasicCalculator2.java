import java.util.*;
public class BasicCalculator2 {
    public static int calc(int a,int b,char c){
        if (c == '+') {
            return a+b;
        }
        else if (c == '-') {
            return a-b;
        }
        else if (c == '*') {
            return a*b;
        }
        else{
            return a/b;
        }
    }
    public static int prec(char c){
        if (c == '*' || c == '/') {
            return 1;
        }
        else if (c == '+' || c == '-') {
            return 0;
        }
        else{
            return 0;
        }
    }
    public static int calculate(String s) {
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        int i = 0;
        while (i<s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int num = 0;
                while (i<s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num*10 + (s.charAt(i)-'0');
                    i++;
                }
                operand.push(num);
                i--;
            }
            else if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                while (operator.size() > 0 && prec(operator.peek())>= prec(s.charAt(i))) {
                    char op = operator.pop();
                    int b = operand.pop();
                    int a = operand.pop();
                    int cal = calc(a, b, op);
                    operand.push(cal);
                }
                operator.push(s.charAt(i));
            }
            else{
                
            }
            i++;
        }
        while (operator.size() > 0) {
            char op = operator.pop();
            int b = operand.pop();
            int a = operand.pop();
            int cal = calc(a, b, op);
            operand.push(cal);
        }
        return operand.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = calculate(str);
        System.out.println(ans);
        sc.close();
    }
}
