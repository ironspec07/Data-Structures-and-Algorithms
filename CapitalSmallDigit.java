import java.util.*;
public class CapitalSmallDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char X = sc.nextLine().charAt(0);
        int a = (int)X;
        if (a>=48 && a<=57) {
            System.out.println("IS DIGIT");
        } else {
            if (a>=65 && a<= 90) {
                System.out.println("ALPHA\nIS CAPITAL");
            }
            if (a>=97 && a<=122) {
                System.out.println("ALPHA\nIS SMALL");
            }
        }
        sc.close();
    }
}
