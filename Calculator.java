import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sum = s.split("(?=\\D)|(?<=\\D)");
        long a = Integer.parseInt(sum[0]);
        String c = sum[1];
        long b = Integer.parseInt(sum[2]);

        switch (c) {
            case "+":
                System.out.println(a+b);
                break;
            
            case "-":
                System.out.println(a-b);
                break;
            
            case "*":
                System.out.println(a*b);
                break;
            
            case "/":
                System.out.println(a/b);
                break;

            default:
                break;
        }
        sc.close();
    }
}
