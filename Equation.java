import java.util.*;
public class Equation {
    public static void equation(int x , int n){
        long s = (long)Math.pow(x, 0)-1;
        for (int i = 2; i <= n; i = i+2) {
            s = s + (long)Math.pow(x, i);
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        equation(x,n);
        sc.close();
    }
}
