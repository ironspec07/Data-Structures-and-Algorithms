import java.util.*;
public class NTimes {
    // public static void printc(int n , char c){
    //     for (int i = 1; i <= n; i++) {
    //         System.out.print(c);
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            char c = sc.nextLine().charAt(0);
            // printc(n,c);
            for (int j = 1; j <= n; j++) {
                System.out.print(c);
            }
        }
        sc.close();
    }
}
