package Stacks;
import java.util.*;
public class InfixToPostfix {
    public static String calc(String a,String b,char c){
        return a+b+c;
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
    public static String convert(String s) {
        Stack<String> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        int i = 0;
        while (i<s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                String num = "";
                while (i<s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num + s.charAt(i);
                    i++;
                }
                operand.push(num);
                i--;
            }
            else if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                String o = ""+s.charAt(i);
                operand.push(o);
            }
            else if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                while (operator.size() > 0 && prec(operator.peek())>= prec(s.charAt(i))) {
                    char op = operator.pop();
                    String b = operand.pop();
                    String a = operand.pop();
                    String cal = calc(a, b, op);
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
            String b = operand.pop();
            String a = operand.pop();
            String cal = calc(a, b, op);
            operand.push(cal);
        }
        return operand.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = convert(str);
        System.out.println(ans);
        sc.close();
    }
}
