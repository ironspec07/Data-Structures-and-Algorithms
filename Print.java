import java.util.*;
public class Print {
    public static void print(int n){
        for (int i = 1; i <= n; i++) {
            if (i==n) {
                System.out.print(i);
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
