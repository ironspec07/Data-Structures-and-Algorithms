import java.util.*;

public class MathematicalExpression {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char s = sc.next().charAt(0);
        int b = sc.nextInt();
        @SuppressWarnings("unused")
        char q = sc.next().charAt(0);
        int c = sc.nextInt();
        switch (s) {
            case '+':
                if (a+b==c) {
                    System.out.println("Yes");
                }
                else{
                    System.out.println(a+b);
                }
                break;
            case '-':
                if (a-b==c) {
                    System.out.println("Yes");
                }
                else{
                    System.out.println(a-b);
                }
                break;
            case '*':
                if (a*b==c) {
                    System.out.println("Yes");
                }
                else{
                    System.out.println(a*b);
                }
                break;
        }
        sc.close();
    }
}