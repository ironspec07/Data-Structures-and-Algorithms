import java.util.*;
public class PrintNTo1 {
    public static void print(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        print(--n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
