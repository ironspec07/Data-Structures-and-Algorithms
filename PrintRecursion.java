import java.util.*;
public class PrintRecursion {
    public static void print(int n){
        if (n<=0) {
            return;
        }
        System.out.println("I love Recursion");
        print(--n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}