import java.util.*;

public class NTimes2 {
    public static void nPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        sc.nextLine(); 

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); 
            char c = sc.next().charAt(0);
            nPrint(n, c); 
        }

        sc.close();
    }
}
